package br.com.alura.estoque.repository.callback;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.internal.EverythingIsNonNull;

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
            callback.quandoFalha("Resposta não Sucessidade");
        }
    }

    @Override
    @EverythingIsNonNull
    public void onFailure(Call<Void> call,
                          Throwable t) {
        callback.quandoFalha("Falha de comunicação: " + t.getMessage());
    }

    public interface RespostaCallback <T> {
        void quandoSucesso();
        void quandoFalha (String erro);
    }

}
