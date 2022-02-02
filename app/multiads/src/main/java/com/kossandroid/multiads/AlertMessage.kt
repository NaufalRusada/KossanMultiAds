package com.kossandroid.multiads

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface

object AlertMessage {
    fun showmessage(
        context: Context,
        title: String,
        message: String,
        onPositiveButtonCallback: () -> Unit
    ) {
        AlertDialog.Builder(context)
            .setTitle(title)
            .setMessage(message)
            .setCancelable(true)
            .setPositiveButton("close", object : DialogInterface.OnClickListener {
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    onPositiveButtonCallback.invoke()
                }


            })
            .show()

    }
}