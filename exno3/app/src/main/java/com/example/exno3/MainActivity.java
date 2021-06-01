package CALCU.CALU; import android.app.Activity;import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class CALCULATORActivity extends Activity implements OnClickListener {
    EditText input1;
    EditText input2;
    Button addition;
    Button subtraction;
    Button multiplication;
    Button division;
    TextView tvResult;
    String oper = "";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        input1 = (EditText) findViewById(R.id.etNum1);
        input2 = (EditText) findViewById(R.id.etNum2);
        addition = (Button) findViewById(R.id.btnAdd);
        subtraction = (Button) findViewById(R.id.btnSub);
        multiplication = (Button) findViewById(R.id.btnMult);
        division = (Button) findViewById(R.id.btnDiv);
        tvResult = (TextView) findViewById(R.id.tvResult);
// set a listener
        addition.setOnClickListener(this);
        subtraction.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        division.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
// TODO Auto-generated method stub
        float num1 = 0;
        float num2 = 0;
        float result = 0;
// check if the fields are empty
        if (TextUtils.isEmpty(input1.getText().toString())
                || TextUtils.isEmpty(input2.getText().toString())) {
            return;
        }
// read EditText and fill variables with numbers
        num1 = Float.parseFloat(input1.getText().toString());
        num2 = Float.parseFloat(input2.getText().toString());
// defines the button that has been clicked and performs the corresponding operation
// write operation into oper, we will use it later for output
        switch (v.getId()) {
            case R.id.btnAdd:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.btnMult:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.btnDiv:
                oper = "/";
                result = num1 / num2;
                break;
            default:
                break;
        }
// form the output line
        tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }
}