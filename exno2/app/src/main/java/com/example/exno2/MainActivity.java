import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class LAYOUTActivity extends Activity {
    /** Called when the activity is first created. */
    EditText txtData1,txtData2;
    float num1,num2,result1,result2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button add = (Button) findViewById(R.id.button1);
        add.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                try
                {
                    txtData1 = (EditText) findViewById(R.id.edittext1);
                    txtData2 = (EditText) findViewById(R.id.edittext2);
                    num1 = Float.parseFloat(txtData1.getText().toString());
                    num2 = Float.parseFloat(txtData2.getText().toString());
                    result1=num1+num2;
                    Toast.makeText(getBaseContext(),"ANSWER:"+result1,Toast.LENGTH_SHORT).show();
                }
                catch(Exception e)
                {
                    Toast.makeText(getBaseContext(), e.getMessage(),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button sub = (Button) findViewById(R.id.button3);
        sub.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                try
                {
                    txtData1 = (EditText) findViewById(R.id.edittext1);
                    txtData2 = (EditText) findViewById(R.id.edittext2);
                    num1 = Float.parseFloat(txtData1.getText().toString());
                    num2 = Float.parseFloat(txtData2.getText().toString());
                    result2=num1-num2;
                    Toast.makeText(getBaseContext(),"ANSWER:"+result2,Toast.LENGTH_SHORT).show();
                }
                catch(Exception e)
                {
                    Toast.makeText(getBaseContext(), e.getMessage(),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button clear = (Button) findViewById(R.id.button2);
        clear.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                try
                {
                    txtData1.setText("");
                    txtData2.setText("");
                }
                catch(Exception e)
                {
                    Toast.makeText(getBaseContext(), e.getMessage(),
                            Toast.LENGTH_SHORT).show();
                }}
        });
    }
}