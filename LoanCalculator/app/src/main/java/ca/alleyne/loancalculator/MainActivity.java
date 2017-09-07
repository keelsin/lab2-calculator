package ca.alleyne.loancalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    int numberOfYears;
    double loanAmount, yearlyInterestRate;
    TextView monthResult,totalResult,interestResult;
    EditText loanInsert,termLoanInsert, yearInterestInsert;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loanInsert = (EditText) findViewById(R.id.loanInsert);
        termLoanInsert = (EditText) findViewById(R.id.termLoanInsert);
        yearInterestInsert = (EditText) findViewById(R.id.yearInterestInsert);
        monthResult = (TextView) findViewById(R.id.monthResult);
        totalResult = (TextView) findViewById(R.id.totalResult);
        interestResult = (TextView) findViewById(R.id.interestResult);
    }//onCreate

    public void calculateResults(View v){
        /*Placing all of the edits into variables*/
        numberOfYears = Integer.parseInt(termLoanInsert.getText().toString());
        loanAmount = Double.parseDouble(loanInsert.getText().toString());
        yearlyInterestRate = Double.parseDouble(yearInterestInsert.getText().toString());

        /* This will calculate the monthly payment */
        double monthlyPayment;
        double monthlyInterestRate;
        int numberOfPayments;
        if (numberOfYears != 0 && yearlyInterestRate != 0)
        {
            //calculate the monthly payment
            monthlyInterestRate = yearlyInterestRate / 1200;
            numberOfPayments = numberOfYears * 12;

            monthlyPayment =
                    (loanAmount * monthlyInterestRate) /
                            (1 - (1 / Math.pow ((1 + monthlyInterestRate), numberOfPayments)));

            monthlyPayment = Math.round (monthlyPayment * 100) / 100.0;
        }
        else
            monthlyPayment = 0;
        monthResult.setText(Double.toString(monthlyPayment));
        totalResult.setText(Double.toString(monthlyPayment * numberOfYears * 12));
        interestResult.setText(Double.toString((monthlyPayment * numberOfYears * 12) - loanAmount));
    }
}
