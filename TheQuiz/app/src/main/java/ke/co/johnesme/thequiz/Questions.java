package ke.co.johnesme.thequiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Questions extends AppCompatActivity{

    Button submit;
    String name;
    EditText editTextName;
    int totalScore = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_questions);

        submit = findViewById(R.id.btnSubmit);
        editTextName = findViewById(R.id.etNewPlayer);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editTextName.getText().toString();

                if(name.length()==0){

                    Toast.makeText(Questions.this, "Please Enter Your Name", Toast.LENGTH_LONG).show();
                }
                else{

                    Toast.makeText(Questions.this, "Hi "+name+", Your Score is "+totalScore, Toast.LENGTH_LONG).show();
                }


            }
        });

    }


    public void onQuestionsClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            //Question one
            case R.id.q1_a:
                if (checked)
                    totalScore = 0;
                    break;

            case R.id.q1_b:
                if (checked)
                    totalScore = 0;
                    break;

            case R.id.q1_c:
                if (checked)
                    totalScore = totalScore + 3;
                    break;

            case R.id.q1_d:
                if (checked)
                    totalScore = 0;
                    break;

            //Question two
            case R.id.q2_a:
                if (checked)
                    totalScore = 0;
                break;

            case R.id.q2_b:
                if (checked)
                    totalScore = 0;
                break;

            case R.id.q2_c:
                if (checked)
                    totalScore = totalScore + 3;
                break;

            case R.id.q2_d:
                if (checked)
                    totalScore = 0;
                break;

            //Question three
            case R.id.q3_a:
                if (checked)
                    totalScore = 0;
                break;

            case R.id.q3_b:
                if (checked)
                    totalScore = 0;
                break;

            case R.id.q3_c:
                if (checked)
                    totalScore = totalScore + 3;
                break;

            case R.id.q3_d:
                if (checked)
                    totalScore = 0;
                break;

            //Question five
            case R.id.q5_a:
                if (checked)
                    totalScore = 0;
                break;

            case R.id.q5_b:
                if (checked)
                    totalScore = 0;
                break;

            case R.id.q5_c:
                if (checked)
                    totalScore = 0;
                break;

            case R.id.q5_d:
                if (checked)
                    totalScore = totalScore + 3;
                break;
            //Question six
            case R.id.q6_a:
                if (checked)
                    totalScore = 0;
                break;

            case R.id.q6_b:
                if (checked)
                    totalScore = 0;
                break;

            case R.id.q6_c:
                if (checked)
                    totalScore = 0;
                break;

            case R.id.q6_d:
                if (checked)
                    totalScore = totalScore + 3;
                break;
        }
    }

    //Question Four
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.q4_a:
                if (checked) {

                    totalScore = 0;
                }

                break;

            case R.id.q4_b:
                if (checked) {

                    totalScore = 0;
                }

                break;

            case R.id.q4_c:
                if (checked) {
                    totalScore = totalScore + 3;
                }

                break;

            case R.id.q4_d:
                if (checked) {
                    totalScore = totalScore + 3;
                }

                break;
           }
        }
}
