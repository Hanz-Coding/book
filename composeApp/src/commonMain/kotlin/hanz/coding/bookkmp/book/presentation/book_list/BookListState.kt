package hanz.coding.bookkmp.book.presentation.book_list

import com.plcoding.bookpedia.core.presentation.UiText
import hanz.coding.bookkmp.book.domain.Book

data class BookListState(
    val searchQuery: String = "",
    val searchResult: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)
