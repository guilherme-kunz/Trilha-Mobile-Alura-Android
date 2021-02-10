package br.com.alura.technews.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.alura.technews.model.Noticia
import br.com.alura.technews.repository.NoticiaRepository
import br.com.alura.technews.repository.Resource

class ListaNoticiasViewModel (private val repository: NoticiaRepository) : ViewModel() {

    private val liveData = MutableLiveData<List<Noticia>>()

    fun buscaTodos() : LiveData<Resource<List<Noticia>?>> {
        return repository.buscaTodos()
    }
}