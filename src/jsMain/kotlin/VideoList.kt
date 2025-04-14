import kotlinx.browser.window
import react.*
import react.dom.*
import react.dom.html.ReactHTML.p

val VideoList = FC<Props> {
    for (video in unwatchedVideos) {
        p {
            +"${video.speaker}: ${video.title}"
        }
    }
}