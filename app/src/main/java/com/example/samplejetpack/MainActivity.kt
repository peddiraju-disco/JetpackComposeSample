package com.example.samplejetpack

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.samplejetpack.ui.theme.SampleJetpackTheme
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            /*SampleJetpackTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MessageCard(Message("Android", "Jetpack Compose"))
                }
            }*/



            PreviewConversation()

            /*Row(modifier = Modifier.padding(all = 18.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.profile_picture),
                    contentDescription = "Sampe Profile Picture",
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
                )

                setWidthSpacer(8.dp)

                Column() {
                    setText("Raju dayta")
                    setHeightSpacer(4.dp)
                    PreviewMessageCard()
                    setHeightSpacer(4.dp)
                    MessageCard(Message("Hey Data1", "Here Data2"))
                }
            }*/


        }
    }
}


@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    MaterialTheme {
        Conversation(SampleData.conversationSample)
    }
}


data class Message(val data1: String, val data2: String)


@Composable
fun MessageCard(message: Message) {
    setText(daat = message.data1)
    setHeightSpacer(4.dp)
    setText(daat = message.data2)
}

@Composable
fun setText(daat: String) {
    Surface(shape = MaterialTheme.shapes.medium, shadowElevation = 10.dp) {
        Text(
            text = daat,
            modifier = Modifier.padding(all = 4.dp),
            style = MaterialTheme.typography.bodyMedium
        )
    }
    Text(
        text = daat,
        style = MaterialTheme.typography.bodyLarge
    )
}

@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Composable
fun PreviewMessageCard() {
    setText("Android")
}

@Composable
fun setWidthSpacer(dp: Dp) {
    Spacer(modifier = Modifier.width(dp))
}

@Composable
fun setHeightSpacer(dp: Dp) {
    Spacer(modifier = Modifier.height(dp))
}