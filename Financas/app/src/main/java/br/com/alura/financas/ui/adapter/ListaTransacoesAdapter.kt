package br.com.alura.financas.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.alura.financas.R

class ListaTransacoesAdapter (transacoes : List<String>,
                              context : Context) : BaseAdapter () {

    private val transacoes = transacoes
    private val context = context

    override fun getCount(): Int {
        return transacoes.size
    }

    override fun getItem(posicao: Int): String {
        return transacoes[posicao]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(posicao: Int, view: View?, parent: ViewGroup?): View {
        return LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)
    }
}