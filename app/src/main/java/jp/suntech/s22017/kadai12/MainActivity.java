package jp.suntech.s22017.kadai12;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import org.jetbrains.annotations.NonNls;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタンオブジェクトの用意
        Button btClick = findViewById(R.id.btConfirm);
        btClick.setOnClickListener(new ButtonClickListener());

        Button btClick2 = findViewById(R.id.btSend);
        btClick2.setOnClickListener(new ButtonClickListener1());

        Button btClick3 = findViewById(R.id.btClear);
        btClick3.setOnClickListener(new ButtonClickListener2());
    }


    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            EditText input = findViewById(R.id.etTitle);
            EditText input2 = findViewById(R.id.erName);
            EditText input3 = findViewById(R.id.etMail);
            EditText input4 = findViewById(R.id.etComment1);

            String inputStr = input.getText().toString();
            String inputStr2 = input2.getText().toString();
            String inputStr3 = input3.getText().toString();
            String inputStr4 = input4.getText().toString();
            Dialog.OrderConfirmDialogFragment dialogFragment = new Dialog.OrderConfirmDialogFragment();
            dialogFragment.show(getSupportFragmentManager(), "OrderConfirmDialogFragment");
            Snackbar.make(v, inputStr + " ," + inputStr2 + " ," + inputStr3 + " ," + inputStr4 + "を送信しました。", Snackbar.LENGTH_LONG).show();
        }
    }

    private class ButtonClickListener1 implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            EditText input = findViewById(R.id.etTitle);
            EditText input2 = findViewById(R.id.erName);
            EditText input3 = findViewById(R.id.etMail);
            EditText input4 = findViewById(R.id.etComment1);

            String inputStr = input.getText().toString();
            String inputStr2 = input2.getText().toString();
            String inputStr3 = input3.getText().toString();
            String inputStr4 = input4.getText().toString();
            Snackbar.make(v, inputStr + " ," + inputStr2 + " ," + inputStr3 + " ," + inputStr4 + "を送信しました。", Snackbar.LENGTH_LONG).show();
        }
    }

    private class ButtonClickListener2 implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            EditText input = findViewById(R.id.etTitle);
            EditText input2 = findViewById(R.id.erName);
            EditText input3 = findViewById(R.id.etMail);
            EditText input4 = findViewById(R.id.etComment1);

            input.setText("");
            input2.setText("");
            input3.setText("");
            input4.setText("");


        }
    }
}