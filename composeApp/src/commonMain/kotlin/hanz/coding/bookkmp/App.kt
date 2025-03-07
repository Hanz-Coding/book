package hanz.coding.bookkmp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import hanz.coding.bookkmp.book.presentation.book_list.BookListScreenRoot
import hanz.coding.bookkmp.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    BookListScreenRoot (
        viewModel = remember { BookListViewModel() },
        onBookClick = {}
    )
}
