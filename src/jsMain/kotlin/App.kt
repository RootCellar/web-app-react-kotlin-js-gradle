import kotlinx.coroutines.async
import react.*
import react.dom.*
import kotlinx.browser.window
import kotlinx.coroutines.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import emotion.react.css
import csstype.Position
import csstype.px
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.img

val App = FC<Props> {
    h1 {
        +"KotlinConf Explorer"
    }
    div {
        h3 {
            +"Videos to watch"
        }

        VideoList()

        h3 {
            +"Videos watched"
        }

        VideoList()
    }
    div {
        css {
            position = Position.absolute
            top = 10.px
            right = 10.px
        }
        h3 {
            +"John Doe: Building and breaking things"
        }
        img {
            src = "https://dummyimage.com/600x400/000000/ffffff&text=Video+Player+Placeholder"
        }
    }
}