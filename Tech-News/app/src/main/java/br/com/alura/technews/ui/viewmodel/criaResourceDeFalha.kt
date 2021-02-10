package br.com.alura.technews.ui.viewmodel

import br.com.alura.technews.model.Noticia
import br.com.alura.technews.repository.Resource

private fun criaResourceDeFalha(
    resourceAtual: Resource<List<Noticia>?>?,
    erro: String?
    ): Resource<List<Noticia>?> {
        if (resourceAtual != null) {
           return  Resource(dado = resourceAtual.dado, erro = erro)
        }
            return Resource(dado = null, erro = erro)
    }