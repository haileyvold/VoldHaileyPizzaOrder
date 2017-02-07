package css.cis3334hailey.voldhaileypizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    RadioButton rbSmall;
    RadioButton rbMedium;
    RadioButton rbLarge;
    CheckBox chkbxCheese;
    CheckBox chkbxDelivery;
    TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize variables

        rbSmall = (RadioButton) findViewById(R.id.radioButtonSmall);
        rbMedium = (RadioButton) findViewById(R.id.radioButtonMedium);
        rbLarge = (RadioButton) findViewById(R.id.radioButtonLarge);
        chkbxCheese = (CheckBox) findViewById(R.id.checkBoxXtraCheese);
        chkbxDelivery = (CheckBox) findViewById(R.id.checkBoxDelivery);
        tvTotal = (TextView) findViewById(R.id.textViewTotal);
    }

    public void onClickBtnCalculate(View view) {
        double totalOne = 0.0;
        double totalTwo = 0.0;
        double totalThree = 0.0;
        double total;

        if (rbSmall.isChecked()) {
            totalOne = 7.00;
        }
        else if (rbMedium.isChecked()) {
            totalOne = 9.00;
        }
        else if (rbLarge.isChecked()) {
            totalOne = 13.00;
        }

        if (chkbxCheese.isChecked()) {
            totalTwo = 1.75;
        }

        if (chkbxDelivery.isChecked()) {
             totalThree = 2.50;
        }

        total = (totalOne + totalTwo + totalThree);
        tvTotal.setText(String.format("Total is $%.2f", total));                                    // this code inserts the value of total for the %.2f location in the string
    }
}
