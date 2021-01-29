package br.com.alura.financask.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.alura.financask.R
import br.com.alura.financask.model.Tipo
import br.com.alura.financask.model.Transacao
import br.com.alura.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf(Transacao(
            valor = BigDecimal(20.5),
            tipo = Tipo.DESPESA,
            data = java.util.Calendar.getInstance()),
            Transacao(BigDecimal(100.0),
                categoria = "Economia",
                tipo = Tipo.RECEITA),
        Transacao(valor = BigDecimal(200.0),
                tipo = Tipo.DESPESA),
        Transacao(valor = BigDecimal(500.0),
                categoria = "Prêmio",
                tipo = Tipo.RECEITA))

        lista_transacoes_listview.setAdapter(
            ListaTransacoesAdapter(transacoes, this))
    }

}