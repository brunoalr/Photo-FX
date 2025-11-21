import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.mmartosdev.photofx.PhotoFxApplication

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport {
        PhotoFxApplication(onCloseClicked = null)
    }
}
