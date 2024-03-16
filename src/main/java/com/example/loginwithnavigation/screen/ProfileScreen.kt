package com.example.loginwithnavigation.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginwithnavigation.R

@Preview(showBackground = true)
@Composable
fun ProfilScreen(){
            Column( modifier = Modifier
                .fillMaxHeight()
                .background(Color.Gray), horizontalAlignment = Alignment.CenterHorizontally) {
                Box(contentAlignment = Alignment.BottomCenter) {
                    Image(painter = painterResource(id = R.drawable.image),contentDescription ="BackgroundImage", contentScale = ContentScale.FillBounds, modifier = Modifier
                        .fillMaxWidth()
                        .height(280.dp)
                        .clip(RoundedCornerShape(25.dp))
                    )
                    Image(painter = painterResource(id = R.drawable.konan) ,contentDescription = "backgroundImage",
                        contentScale = ContentScale.Crop, modifier = Modifier
                            .size(120.dp)
                            .clip(CircleShape)
                            .border(
                                3.dp,
                                Color.Gray, CircleShape
                            )
                    )
                }
             Text(text = "Konan", style = TextStyle(fontSize = 50.sp, fontFamily = FontFamily.Cursive))
                Text(text = "Konan", fontSize = 20.sp, color = Color.White)
                Button(onClick = { }, colors =ButtonDefaults.buttonColors(Color(0xFF48A6D1)), shape = RoundedCornerShape(50.dp), modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .padding(10.dp)) {
                    Text(text = "LogOut")
                }
                Button(onClick = { } ,colors =ButtonDefaults.buttonColors(Color.Gray), border = BorderStroke(4.dp,
                    Color(0xFF48A6D1)
                ) ,shape = RoundedCornerShape(50.dp), modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .padding(10.dp)) {
                    Text(text = "Delete your account")
                }
                Spacer(modifier = Modifier.height(120.dp))
                ClickableText(text = AnnotatedString(("YouneedSupport?ContaactUs")), onClick = {}, style =
                TextStyle(fontSize = 14.sp, fontFamily = FontFamily.Default, textDecoration = TextDecoration.Underline)
                )
            }

}