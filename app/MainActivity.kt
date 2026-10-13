package com.example.baitapnho

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                ThucHanh01_Screen()
            }
        }
    }
}

@Composable
fun ThucHanh01_Screen() {
    // Trạng thái lưu chuỗi hiển thị ở giữa màn hình
    var messageText by remember { mutableStateOf("Hello") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .statusBarsPadding()
            .navigationBarsPadding()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Tiêu đề phía trên
        Spacer(modifier = Modifier.height(60.dp))
        Text(
            text = "My First App",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        // Khoảng trống co giãn đẩy dòng thông điệp vào đúng trọng tâm màn hình
        Spacer(modifier = Modifier.weight(1f))

        // Dòng chữ hiển thị thay đổi theo trạng thái
        Text(
            text = messageText,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        // Khoảng trống co giãn đẩy nút bấm xuống đáy
        Spacer(modifier = Modifier.weight(1f))

        // Nút Say Hi!
        Button(
            onClick = {
                messageText = "I'm\nNguyen Thai Khang"
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1D61D2)
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .width(160.dp)
                .height(48.dp)
        ) {
            Text(
                text = "Say Hi!",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(40.dp))
    }
}