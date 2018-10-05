package sallycs.com.bitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.decInput);
                String decTxt = input.getText().toString();
                TextView message = findViewById(R.id.msg);
                TextView binary = findViewById(R.id.bitVal);
                TextView hexMsg = findViewById(R.id.hexMsg);
                TextView hex = findViewById(R.id.hexVal);

                message.setText("");
                binary.setText("");
                hexMsg.setText("");
                hex.setText("");


                if(decTxt.length()<0) {
                    message.setText("Input a number");
                }
                else{
                    int dec = Integer.parseInt(decTxt);
                    input.getText().clear();

                    if(dec>255){
                        message.setText("Input a number from 0 to 255");
                    }
                    else{
                        message.setText("Binary Value of " + dec +":");
                        binary.setText(Integer.toBinaryString(dec));

                        hexMsg.setText("Hexadecimal Value of " + dec +":");
                        hex.setText(Integer.toHexString(dec));
                    }
                }



            }
        });
    }
}
