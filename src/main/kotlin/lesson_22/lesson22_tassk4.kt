package org.example.lesson_22

class MainScreenViewModel {

    data class MainScreenState(
        val data: String? = null, //загружаемые данные
        val isLoading: Boolean = false //индикатор процесса загрузки
    )

    private var state: MainScreenState = MainScreenState()

    fun getState(): MainScreenState = state

    fun loadData() {
        state = state.copy(data = null, isLoading = false)
        println("Состояние: $state")

        state = state.copy(isLoading = true)
        println("Состояние: $state")

        state = state.copy(
            data = "Загруженные данные с сервера",
            isLoading = false
        )
        println("Состояние: $state")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}