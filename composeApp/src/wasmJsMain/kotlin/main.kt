import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.mmartosdev.photofx.PhotoFxApplication
import org.jetbrains.skiko.wasm.onWasmReady

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        ComposeViewport {
            PhotoFxApplication(onCloseClicked = null)
        }
    }
}
