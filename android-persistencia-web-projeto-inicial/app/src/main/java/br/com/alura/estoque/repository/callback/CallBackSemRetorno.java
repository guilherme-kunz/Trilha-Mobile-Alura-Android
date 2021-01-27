package br.com.alura.estoque.repository.callback;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.internal.EverythingIsNonNull;

import static br.com.alura.estoque.repository.callback.MensagensCallBack.MENSAGEM_ERRO_FALHA_COMUNICACAO;
import static br.com.alura.estoque.repository.callback.MensagensCallBack.MENSAGEM_ERRO_RESPOSTA_NAO_SUCEDIDA;

public class CallBackSemRetorno implements Callback<Void> {

    private final RespostaCallback callback;

    public CallBackSemRetorno(RespostaCallback callback) {
        this.callback = callback;
    }

    @Override
    @EverythingIsNonNull
    public void onResponse(Call<Void> call,
                           Response<Void> response) {
        if (response.isSuccessful()){
            callback.quandoSucesso();
        } else {
            callback.quandoFalha(MENSAGEM_ERRO_RESPOSTA_NAO_SUCEDIDA);
        }
    }

    @Override
    @EverythingIsNonNull
    public void onFailure(Call<Void> call,
                          Throwable t) {
        callback.quandoFalha(MENSAGEM_ERRO_FALHA_COMUNICACAO + t.getMessage());
    }

    public interface RespostaCallback <T> {
        void quandoSucesso();
        void quandoFalha (String erro);
    }

}
