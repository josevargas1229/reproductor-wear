package com.example.reproductor.presentation.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.reproductor.R
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.material.icons.filled.Repeat
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.geometry.Offset
import androidx.compose.material.icons.filled.Menu








// Pantallas disponibles
enum class Screen {
    NOW_PLAYING,
    LIBRARY
}

// Modelo de canción
data class Song(val title: String, val subtitle: String, val imageRes: Int)

@Composable
fun MusicPlayerApp() {
    var currentScreen by remember { mutableStateOf(Screen.NOW_PLAYING) }

    when (currentScreen) {
        Screen.NOW_PLAYING -> NowPlayingScreen(
            songTitle = "Something Just Like This",
            artist = "The Chainsmokers, Coldplay",
            onLibraryClick = { currentScreen = Screen.LIBRARY }
        )
        Screen.LIBRARY -> MusicLibraryScreen(
            songs = listOf(
                Song("Taylor Swift", "50 Songs", R.drawable.album1),
                Song("Taylor Swift", "2010s Mix", R.drawable.album1),
                Song("Leave Before", "10 Songs", R.drawable.album1)
            ),
            onSongClick = { currentScreen = Screen.NOW_PLAYING },
            onBackClick = { currentScreen = Screen.NOW_PLAYING }
        )
    }
}

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun NowPlayingScreen(
    songTitle: String,
    artist: String,
    onLibraryClick: () -> Unit
) {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .drawBehind {
                drawRect(
                    brush = Brush.radialGradient(
                        colors = listOf(Color(0xFF12833E), Color.Black), // verde más oscuro
                        center = Offset(size.width / 2f, size.height / 2f),
                        radius = size.minDimension / 1.8f // ⬅️ menor radio = degradado más suave
                    )
                )
            }
            .padding(12.dp)
    ) {
        // Botón superior: Biblioteca
        IconButton(
            onClick = onLibraryClick,
            modifier = Modifier
                .align(Alignment.TopCenter)
        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Ir a biblioteca",
                tint = Color.White,
                modifier = Modifier.size(26.dp)
            )
        }

        // Contenido principal
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 36.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Texto: título y artista
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = songTitle,
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    maxLines = 2
                )
                Text(
                    text = artist,
                    color = Color.Gray,
                    fontSize = 11.sp,
                    textAlign = TextAlign.Center,
                    maxLines = 1
                )
            }
            // Fila completa: 🔀 Shuffle | controles | Repeat 🔁
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                // Botón Anterior
                IconButton(
                    onClick = { /* Acción anterior */ },
                    modifier = Modifier.size(36.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.SkipPrevious,
                        contentDescription = "Anterior",
                        tint = Color.White,
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Spacer(modifier = Modifier.width(20.dp))

                // Botón Pausa (circular, estilo Spotify)
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color(0xFF1DB954), shape = CircleShape)
                        .clickable { /* Acción pausa */ },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Pause,
                        contentDescription = "Pausar",
                        tint = Color.White,
                        modifier = Modifier.size(28.dp)
                    )
                }

                Spacer(modifier = Modifier.width(20.dp))

                // Botón Siguiente
                IconButton(
                    onClick = { /* Acción siguiente */ },
                    modifier = Modifier.size(36.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.SkipNext,
                        contentDescription = "Siguiente",
                        tint = Color.White,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }

    }
    }
@Composable
fun MusicLibraryScreen(
    songs: List<Song>,
    onSongClick: (Song) -> Unit,
    onBackClick: () -> Unit // 👈 NUEVO parámetro
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .drawBehind {
                drawRect(
                    brush = Brush.radialGradient(
                        colors = listOf(Color(0xFF12833E), Color.Black),
                        center = Offset(size.width / 2f, size.height / 2f),
                        radius = size.minDimension / 1.8f
                    )
                )
            },
        horizontalAlignment = Alignment.Start
    ) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "MI MUSICA",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )

                IconButton(
                    onClick = onBackClick,
                    modifier = Modifier.size(24.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = "Volver al reproductor",
                        tint = Color.White
                    )
                }
            }
        }
        items(songs) { song ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onSongClick(song) }
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            ) {
                Image(
                    painter = painterResource(id = song.imageRes),
                    contentDescription = song.title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(48.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(text = song.title, color = Color.White, fontWeight = FontWeight.Bold)
                    Text(text = song.subtitle, color = Color.Gray, fontSize = 12.sp)
                }
            }
        }
    }
}
