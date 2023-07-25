package jp.suntech.s22017.kadai12;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class OrderConfirmDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("送信確認");
        builder.setMessage("以下の内容を送信します。よろしいですか？");
        builder.setPositiveButton("Ok", new DialogButtonClickListener());
        builder.setNegativeButton("キャンセル", new DialogButtonClickListener());
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
