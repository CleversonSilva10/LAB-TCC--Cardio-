package br.com.tcc.tcccardiot21.extension

import android.content.Intent
import android.os.Build
import android.os.Bundle
import java.io.Serializable


fun <T : Serializable?> Intent.getSerializable(key: String, m_class: Class<T>): T {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
        this.getSerializableExtra(key, m_class)!!
    else
        this.getSerializableExtra(key) as T
}

fun <T : Serializable?> Bundle.getSerializableEx(key: String, m_class: Class<T>): T {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
        this.getSerializable(key, m_class)!!
    else
        this.getSerializable(key) as T
}