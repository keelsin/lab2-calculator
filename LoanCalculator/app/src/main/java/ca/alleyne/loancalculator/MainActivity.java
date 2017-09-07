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
    EditText loanInsert,termLoanHint, yearlyRateHint;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loanInsert = (EditText) findViewById(R.id.loanInsert);
        termLoanHint = (EditText) findViewById(R.id.termLoanInsert);
        yearlyRateHint = (EditText) findViewById(R.id.yearInterestInsert);
        monthResult = (TextView) findViewById(R.id.monthResult);
        totalResult = (TextView) findViewById(R.id.totalResult);
        interestResult = (TextView) findViewById(R.id.interestResult);
    }//onCreate

    public void monthlyPayment(View v){

    }

    public void totalPayment(View v){

    }

    public void totalInterest(View v){

    }
}
