package s236334.gradeksempel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tekst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tekst = (EditText) findViewById(R.id.temp);
        final Button celsiusknapp = (Button) findViewById(R.id.tilgrader);
        final Button fahrenheitknapp = (Button) findViewById(R.id.tilfahrenheit);

        celsiusknapp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float innverdi = Float.parseFloat(tekst.getText().toString());
                tekst.setText(String.valueOf(convertFahrenheitToCelsius(innverdi)));
            }
        });

        fahrenheitknapp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float innverdi = Float.parseFloat(tekst.getText().toString());
                tekst.setText(String.valueOf(convertCelsiusToFahrenheit(innverdi)));
            }
        });
    }

    float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }
}
