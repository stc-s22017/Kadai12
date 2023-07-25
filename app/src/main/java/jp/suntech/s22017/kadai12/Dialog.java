package jp.suntech.s22017.kadai12;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Dialog extends DialogFragment {
    public static class OrderConfirmDialogFragment extends DialogFragment{
        @Override
        public android.app.Dialog onCreateDialog(@Nullable Bundle savedInstanceState){
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle("送信確認");
            builder.setMessage("以下の内容を送信します。よろしいですか？");
            builder.setPositiveButton("Ok", new DialogButtonClickListener());
            builder.setNegativeButton("キャンセル", new DialogButtonClickListener());
            AlertDialog dialog = builder.create();
            return dialog;
        }
    }

    public static class DialogButtonClickListener implements DialogInterface.OnClickListener{

        @Override
        public void onClick(DialogInterface dialog, int which) {
            String msg="";
            switch(which){
                case DialogInterface.BUTTON_POSITIVE:
                    msg = "OK";
                    break;
                case DialogInterface.BUTTON_NEGATIVE:
                    msg = "OK";
                    break;
            }

        }
    }
}
