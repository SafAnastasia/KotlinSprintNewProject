package org.example.lesson_22

data class MainScreenState (
    val data: String = " ", //загружаемые данные
    val isLoading: Boolean = false //индикатор процесса загрузки
)
class MainScreenViewModel: ViewModel() {
    private val _mainScreenState = MutableLiveData(MainScreenState())
    val mainScreenState: LiveData<MainScreenState> = _mainScreenState

    fun loadData() {

    }
}