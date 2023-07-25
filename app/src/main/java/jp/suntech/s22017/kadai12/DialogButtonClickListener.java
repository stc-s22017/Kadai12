package jp.suntech.s22017.kadai12;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogButtonClickListener implements DialogInterface.OnClickListener{

    @Override
    public void onClick(DialogInterface dialog, int which) {
        String msg="";
        switch(which){
            case DialogInterface.BUTTON_POSITIVE:
                msg = "Ok";
                break;
            case DialogInterface.BUTTON_NEGATIVE:
                break;
        }
    }
}

