package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceApp(modifier: Modifier = Modifier) {
    var buttonControl by remember { mutableStateOf(1) }
    Column {
        when (buttonControl) {
            1 -> ArtSpaceLayout(
                albumCover = painterResource(R.drawable._aquemini),
                content = stringResource(R.string.aquemini),
                album = stringResource(R.string.aquemini),
                artistAndYear = stringResource(R.string.outkast1)
            )

            2 -> ArtSpaceLayout(
                albumCover = painterResource(R.drawable._thugmotivation),
                content = stringResource(R.string.thug_motivation),
                album = stringResource(R.string.thug_motivation),
                artistAndYear = stringResource(R.string.jeezy)
            )

            3 -> ArtSpaceLayout(
                albumCover = painterResource(R.drawable._stankonia),
                content = stringResource(R.string.stankonia),
                album = stringResource(R.string.stankonia),
                artistAndYear = stringResource(R.string.outkast2)
            )

            4 -> ArtSpaceLayout(
                albumCover = painterResource(R.drawable._trapmuzik),
                content = stringResource(R.string.trap_muzik),
                album = stringResource(R.string.trap_muzik),
                artistAndYear = stringResource(R.string.ti)
            )

            5 -> ArtSpaceLayout(
                albumCover = painterResource(R.drawable._culture),
                content = stringResource(R.string.culture),
                album = stringResource(R.string.culture),
                artistAndYear = stringResource(R.string.migos)
            )

            6 -> ArtSpaceLayout(
                albumCover = painterResource(R.drawable._wordofmouf),
                content = stringResource(R.string.word_of_mouf),
                album = stringResource(R.string.word_of_mouf),
                artistAndYear = stringResource(R.string.ludacris)
            )

            7 -> ArtSpaceLayout(
                albumCover = painterResource(R.drawable._flockaveli),
                content = stringResource(R.string.flockaveli),
                album = stringResource(R.string.flockaveli),
                artistAndYear = stringResource(R.string.waka_flocka)
            )

            8 -> ArtSpaceLayout(
                albumCover = painterResource(R.drawable._thestatevsradricdavis),
                content = stringResource(R.string.the_state),
                album = stringResource(R.string.the_state),
                artistAndYear = stringResource(R.string.gucci)
            )

            9 -> ArtSpaceLayout(
                albumCover = painterResource(R.drawable._crunkjuice),
                content = stringResource(R.string.crunk_juice),
                album = stringResource(R.string.crunk_juice),
                artistAndYear = stringResource(R.string.lil_jon)
            )

            10 -> ArtSpaceLayout(
                albumCover = painterResource(R.drawable._aquemini),
                content = stringResource(R.string.my_turn),
                album = stringResource(R.string.my_turn),
                artistAndYear = stringResource(R.string.lil_baby)
            )
        }
        Row {
            Button(
                onClick = { buttonControl-- } //if button control is < 1, make it 1. else --
            ) {
                Text(text = "Previous")
            }
            Button(
                onClick = { buttonControl++ } //if button control is > 10, make it 10, else ++
            ) {
                Text(text = "Next")
            }
        }
    }

}

@Composable
fun ArtSpaceLayout(
    albumCover: Painter,
    content: String,
    album: String,
    artistAndYear: String
    ) {
    Column {
        Image(
        painter = albumCover,
        contentDescription = content
    )
        Text(
            text = album
        )
        Text(
            text = artistAndYear
        )

    }
}


@Preview(showBackground = true)
@Composable
fun ArtSpacePreview() {
    ArtSpaceAppTheme {
        ArtSpaceApp()
    }
}