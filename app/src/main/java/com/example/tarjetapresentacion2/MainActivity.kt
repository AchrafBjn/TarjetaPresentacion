package com.example.tarjetapresentacion2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.tarjetapresentacion2.ui.theme.TarjetaPresentacion2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacion2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    TarjetaPresentacion()
                }
            }
        }
    }}

@Composable
fun TarjetaPresentacionVertical(modifier: Modifier = Modifier) {
    val imagenFondo = painterResource(R.drawable.imgfondo2)
    val imagenIcono = painterResource(R.drawable.img1)
    val imagenCentro = painterResource(R.drawable.imgcentro)
    val imagenEstudios = painterResource(R.drawable.imgdegree)
    val imagenPlaneta = painterResource(R.drawable.imgplaneta)
    val imagenEmail = painterResource(R.drawable.imgemail)
    val imagenTelefono = painterResource(R.drawable.imgtelefono)
    val imagenInstagram = painterResource(R.drawable.imginstagram)
    val imagenWebsite = painterResource(R.drawable.imgwebsite)
    val startAlign = TextAlign.Start
    val estiloCursiva = FontStyle.Italic


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            Image(
                painter = imagenFondo,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }

        Column(

        ) {
            Row {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    InsertarImagen(
                        imagen = imagenIcono,
                        tamanyoImagen = 200,
                        startPadding = 15
                    )
                }
                Column(
                    modifier = modifier
                        .weight(1f)
                        .padding(horizontal = 15.dp, vertical = 40.dp)
                ) {
                    WriteText(
                        texto = stringResource(R.string.fullNameVertically),
                        tamanyoFuente = 30,
                        alineacionTexto = startAlign,
                        estilo = estiloCursiva
                    )
                }
            }
            Column(
                modifier = modifier
                    .padding(vertical = 25.dp, horizontal = 25.dp)
                    .border(2.dp, Color.White)
            ) {
                Row(
                    modifier = modifier.padding(start = 30.dp, end = 20.dp)
                ) {
                    InsertarImagen(
                        imagen = imagenCentro,
                        tamanyoImagen = 80
                    )
                    WriteText(
                        texto = stringResource(R.string.centerName),
                        topPadding = 20,
                    )
                }
                Row(
                    modifier = modifier.padding(start = 80.dp)
                ) {
                    InsertarImagen(
                        imagen = imagenEstudios,
                        tamanyoImagen = 80
                    )
                    WriteText(
                        texto = stringResource(R.string.curso),
                        topPadding = 28,
                        startPadding = 5
                    )
                }
            }
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
            ) {
                Row(
                    modifier = modifier
                        .align(alignment = Alignment.Start)
                        .padding(start = 35.dp, bottom = 5.dp)
                ) {
                    InsertarImagen(
                        imagen = imagenPlaneta
                    )
                    LocationActionVertical()
                }
                Row(
                    modifier = modifier
                        .align(alignment = Alignment.End)
                        .padding(end = 35.dp, bottom = 10.dp)
                ) {
                    InsertarImagen(
                        imagen = imagenTelefono
                    )
                    TelNumberVertical()
                }
                Row(
                    modifier = modifier
                        .align(alignment = Alignment.Start)
                        .padding(start = 35.dp, bottom = 10.dp)
                ) {
                    InsertarImagen(
                        imagen = imagenEmail
                    )
                    EmailActionVertical()
                }
                Row(
                    modifier = modifier
                        .align(alignment = Alignment.End)
                        .padding(end = 35.dp, bottom = 10.dp)
                ) {
                    InsertarImagen(
                        imagen = imagenInstagram,
                        tamanyoImagen = 50
                    )
                    InstagramActionVertical()
                }
                Row(
                    modifier = modifier
                        .align(alignment = Alignment.Start)
                        .padding(start = 35.dp)
                ) {
                    InsertarImagen(
                        imagen = imagenWebsite
                    )
                    WebsiteActionVertical()
                }
            }
        }
    }


}

@Composable
fun TarjetaPresentacionHorizontal() {
    val imagenFondo = painterResource(R.drawable.imgfondo2)
    val imagenIcono = painterResource(R.drawable.img1)
    val imagenCentro = painterResource(R.drawable.imgcentro)
    val imagenEstudios = painterResource(R.drawable.imgdegree)
    val imagenPlaneta = painterResource(R.drawable.imgplaneta)
    val imagenEmail = painterResource(R.drawable.imgemail)
    val imagenTelefono = painterResource(R.drawable.imgtelefono)
    val imagenInstagram = painterResource(R.drawable.imginstagram)
    val imagenWebsite = painterResource(R.drawable.imgwebsite)
    val estiloCursiva = FontStyle.Italic

    Box {
        Column {
            Image(
                painter = imagenFondo,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
        Column {
            Row {
                Column {
                    InsertarImagen(
                        imagen = imagenIcono,
                        tamanyoImagen = 200,
                        startPadding = 30
                    )
                }
                Column {
                    Row(
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        WriteText(
                            texto = stringResource(R.string.fullNameHorizontally),
                            topPadding = 10,
                            tamanyoFuente = 40,
                            estilo = estiloCursiva
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 5.dp, start = 2.dp, end = 50.dp)
                            .height(110.dp)
                            .border(2.dp, Color.White),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceAround
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            InsertarImagen(
                                imagen = imagenCentro,
                                tamanyoImagen = 55
                            )
                            WriteText(
                                texto = stringResource(R.string.centerName),
                                tamanyoFuente = 25,
                                topPadding = 12,
                                startPadding = 10
                            )
                        }
                        Row(
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            InsertarImagen(
                                imagen = imagenEstudios,
                                tamanyoImagen = 80
                            )
                            WriteText(
                                texto = stringResource(R.string.curso),
                                tamanyoFuente = 25,
                                topPadding = 15,
                                startPadding = 5
                            )
                        }
                    }

                }
            }
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly

                ) {
                    Row(
                        modifier = Modifier.padding(end = 23.dp)
                    ) {
                        InsertarImagen(
                            imagen = imagenPlaneta,
                            tamanyoImagen = 45
                        )
                        LocationActionHorizontal()
                    }
                    Row {
                        InsertarImagen(
                            imagen = imagenTelefono,
                            tamanyoImagen = 45
                        )
                        TelNumberHorizontal()
                    }


                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Row {
                        InsertarImagen(
                            imagen = imagenWebsite,
                            tamanyoImagen = 45
                        )
                        WebsiteActionHorizontal()
                    }
                    Row(
                        modifier = Modifier.padding(end = 10.dp)
                    ) {
                        InsertarImagen(
                            imagen = imagenInstagram,
                            tamanyoImagen = 55
                        )
                        InstagramActionHorizontal()
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Row {
                        InsertarImagen(
                            imagen = imagenEmail,
                            tamanyoImagen = 45
                        )
                        EmailActionHorizontal()
                    }
                }
            }
        }
    }
}

@Composable
fun TarjetaPresentacion() {
    BoxWithConstraints {
        if (maxWidth < 500.dp) {
            TarjetaPresentacionVertical()
        } else {
            TarjetaPresentacionHorizontal()
        }
    }
}

@Composable
private fun InsertarImagen(
    imagen: Painter,
    tamanyoImagen: Int = 40,
    startPadding: Int = 0
) {
    Image(
        painter = imagen,
        contentDescription = null,
        modifier = Modifier
            .size(tamanyoImagen.dp)
            .padding(start = startPadding.dp)
    )
}

@Composable
private fun WriteText(
    texto: String,
    tamanyoFuente: Int = 20,
    alturaEntreLineas: Int = 1,
    topPadding: Int = 0,
    startPadding: Int = 0,
    bottomPadding: Int = 0,
    endPadding: Int = 0,
    decoracionTexto: TextDecoration = TextDecoration.None,
    colorTexto: Color = Color.White,
    alineacionTexto: TextAlign = TextAlign.Center,
    estilo: FontStyle = FontStyle.Normal
) {
    Text(
        text = texto,
        color = colorTexto,
        fontStyle = estilo,
        fontSize = tamanyoFuente.sp,
        lineHeight = alturaEntreLineas.em,
        fontWeight = FontWeight.Bold,
        textAlign = alineacionTexto,
        textDecoration = decoracionTexto,
        modifier = Modifier.padding(
            top = topPadding.dp,
            start = startPadding.dp,
            bottom = bottomPadding.dp,
            end = endPadding.dp
        )
    )
}

@Composable
fun LocationActionVertical() {
    val decoracionTexto = TextDecoration.Underline
    val location = stringResource(R.string.ubicacion)
    val localContext = LocalContext.current
    TextButton(onClick = {
        val textLocation = "https://maps.app.goo.gl/mqjp4ySiDVh4dqRN7"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(textLocation)
        startActivity(localContext, intent, null)
    }) {
        WriteText(
            texto = location,
            bottomPadding = 10,
            decoracionTexto = decoracionTexto
        )

    }
}

@Composable
fun LocationActionHorizontal() {
    val decoracionTexto = TextDecoration.Underline
    val location = stringResource(R.string.ubicacion)
    val localContext = LocalContext.current
    TextButton(onClick = {
        val textLocation = "https://maps.app.goo.gl/mqjp4ySiDVh4dqRN7"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(textLocation)
        startActivity(localContext, intent, null)
    }) {
        WriteText(
            texto = location,
            bottomPadding = 7,
            startPadding = 10,
            decoracionTexto = decoracionTexto
        )

    }
}

@Composable
fun TelNumberVertical() {
    val numeroTelefono = stringResource(R.string.telephoneNumber)
    val localContext = LocalContext.current
    TextButton(onClick = {
        val textPhone = "tel: $numeroTelefono"
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse(textPhone)
        startActivity(localContext, intent, null)
    }) {
        WriteText(
            texto = numeroTelefono,
            bottomPadding = 5
        )

    }
}

@Composable
fun TelNumberHorizontal() {
    val numeroTelefono = stringResource(R.string.telephoneNumber)
    val localContext = LocalContext.current
    TextButton(onClick = {
        val textPhone = "tel: $numeroTelefono"
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse(textPhone)
        startActivity(localContext, intent, null)
    }) {
        WriteText(
            texto = numeroTelefono,
            bottomPadding = 5,
            startPadding = 10
        )

    }
}

@Composable
fun WebsiteActionVertical() {
    val colorTexto = Color(91, 161, 236)
    val decoracionTexto = TextDecoration.Underline
    val website = stringResource(R.string.website)
    val localContext = LocalContext.current
    TextButton(onClick = {
        val textWebsite = "https://achraf.com"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(textWebsite)
        startActivity(localContext, intent, null)
    }) {
        WriteText(
            texto = website,
            bottomPadding = 5,
            decoracionTexto = decoracionTexto,
            colorTexto = colorTexto
        )

    }
}

@Composable
fun WebsiteActionHorizontal() {
    val colorTexto = Color(91, 161, 236)
    val decoracionTexto = TextDecoration.Underline
    val website = stringResource(R.string.website)
    val localContext = LocalContext.current
    TextButton(onClick = {
        val textWebsite = "https://achraf.com"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(textWebsite)
        startActivity(localContext, intent, null)
    }) {
        WriteText(
            texto = website,
            bottomPadding = 7,
            startPadding = 10,
            decoracionTexto = decoracionTexto,
            colorTexto = colorTexto
        )

    }
}

@Composable
fun InstagramActionVertical() {
    val instagram = stringResource(R.string.instagram)
    val localContext = LocalContext.current
    TextButton(onClick = {
        val textInsta = "https://www.instagram.com/$instagram/"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(textInsta)
        startActivity(localContext, intent, null)
    }) {
        WriteText(
            texto = instagram,
            bottomPadding = 4,
        )

    }
}

@Composable
fun InstagramActionHorizontal() {
    val instagram = stringResource(R.string.instagram)
    val localContext = LocalContext.current
    TextButton(onClick = {
        val textInsta = "https://www.instagram.com/$instagram/"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(textInsta)
        startActivity(localContext, intent, null)
    }) {
        WriteText(
            texto = instagram,
            bottomPadding = 10,
            startPadding = 10,
        )

    }
}

@Composable
fun EmailActionVertical() {
    val decoracionTexto = TextDecoration.Underline
    val email = stringResource(R.string.email)
    val localContext = LocalContext.current
    TextButton(onClick = {
        val intentMail = Intent(Intent.ACTION_SEND, Uri.parse(email))
        //intentMail.type = "plain/text"
        intentMail.putExtra(Intent.EXTRA_SUBJECT, "Nuevo mail")
        intentMail.putExtra(Intent.EXTRA_EMAIL, arrayOf("achrafboujaanan2004@gmail.com"))
        startActivity(localContext, intentMail, null)
    }) {
        WriteText(
            texto = email,
            bottomPadding = 10,
            decoracionTexto = decoracionTexto
        )
    }
}

@Composable
fun EmailActionHorizontal() {
    val decoracionTexto = TextDecoration.Underline
    val email = stringResource(R.string.email)
    val localContext = LocalContext.current
    TextButton(onClick = {
        val intentMail = Intent(Intent.ACTION_SEND, Uri.parse(email))
        //intentMail.type = "plain/text"
        intentMail.putExtra(Intent.EXTRA_SUBJECT, "Nuevo email")
        intentMail.putExtra(Intent.EXTRA_EMAIL, arrayOf("achrafboujaanan2004@gmail.com"))
        startActivity(localContext, intentMail, null)
    }) {
        WriteText(
            texto = email,
            bottomPadding = 7,
            startPadding = 10,
            decoracionTexto = decoracionTexto
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PresentacionPreview() {
    TarjetaPresentacion2Theme {
        TarjetaPresentacionVertical()
    }
}