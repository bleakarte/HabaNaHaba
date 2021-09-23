package com.example.anti_skengman;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    //General
    private ImageView ivSavings;
    private ImageView ivRent;
    private ImageView ivBills;
    private ImageView ivInvest;
    private ImageView ivInsurance;
    private ImageView ivEnjoyment;
    private ImageView ivIncome;
    private ImageView ivExpense;

    //Income
    private int editSavings;
    private int tvSavingsBalance;
    private int tvSavingsTarget;
    private ImageView ivAddSavings;
    private ImageView ivSubSavings;

    private EditText editInvestments;
    private TextView tvInvestmentsBalance;
    private ImageView ivAddInvestments;
    private ImageView ivSubInvestments;

    private EditText editInsurance;
    private TextView tvInsuranceBalance;
    private ImageView ivAddInsurance;
    private ImageView ivSubInsurance;
    //Expense
    private EditText editRent;
    private TextView tvRentBalance;
    private ImageView ivAddRent;
    private ImageView ivSubRent;

    private EditText editBills;
    private TextView tvBillsBalance;
    private ImageView ivAddBills;
    private ImageView ivSubBills;

    private EditText editEnjoyment;
    private TextView tvEnjoymentBalance;
    private ImageView ivAddEnjoyment;
    private ImageView ivSubEnjoyment;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    Totals totalsInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

////Income calculations
//        //Savings
//        editSavings = findViewById(R.id.editSavings);
//
//        ivAddSavings = findViewById(R.id.ivAddSavings);
//        ivSavings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { addSavings(); }
//        });
//
//        ivSubSavings = findViewById(R.id.ivSubSavings);
//        ivSubSavings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { subSavings(); }
//        });
//
//        //Investments
//        editInvestments = findViewById(R.id.editInvestment);
//
//        ivAddInvestments = findViewById(R.id.ivAddInvestment);
//        ivAddInvestments.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { addInvestments(); }
//        });
//
//        ivSubInvestments = findViewById(R.id.ivSubInvestment);
//        ivSubInvestments.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { subInvestments(); }
//        });
//
//        //Insurance
//        editInsurance = findViewById(R.id.editInsurance);
//
//        ivAddInsurance = findViewById(R.id.ivAddInsurance);
//        ivAddInsurance.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { addInsurance(); }
//        });
//
//        ivSubInsurance = findViewById(R.id.ivSubInsurance);
//        ivSubInsurance.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { subInsurance(); }
//        });

//        //Expense calculations
//        //Rent
//        editRent = findViewById(R.id.editRent);
//
//        ivAddRent  = findViewById(R.id.ivAddRent );
//        ivRent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { addRent(); }
//        });
//
//        ivSubRent = findViewById(R.id.ivSubRent);
//        ivSubRent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { subRent(); }
//        });
//
//        //Bills
//        editBills = findViewById(R.id.editBills);
//
//        ivAddBills = findViewById(R.id.ivAddBills);
//        ivAddBills.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { addBills(); }
//        });
//
//        ivSubBills = findViewById(R.id.ivSubBills);
//        ivSubBills.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { subBills(); }
//        });
//
//        //Enjoyment
//        editEnjoyment = findViewById(R.id.editEnjoyment);
//
//        ivAddEnjoyment = findViewById(R.id.ivAddEnjoyment);
//        ivAddEnjoyment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { addEnjoyment(); }
//        });
//
//        ivSubEnjoyment = findViewById(R.id.ivSubEnjoyment);
//        ivSubEnjoyment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { subEnjoyment(); }
//        });


//Start of menu listeners
        ivSavings = findViewById(R.id.ivSavings);
        ivSavings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { showDialogSave(); }
        });

        ivRent = findViewById(R.id.ivRent);
        ivRent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogRent();
            }
        });

        ivBills = findViewById(R.id.ivBills);
        ivBills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogBills();
            }
        });

        ivInvest = findViewById(R.id.ivInvest);
        ivInvest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogInvest();
            }
        });

        ivInsurance = findViewById(R.id.ivInsurance);
        ivInsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogInsurance();
            }
        });

        ivEnjoyment = findViewById(R.id.ivEnjoyment);
        ivEnjoyment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogEnjoyment();
            }
        });

        ivIncome= findViewById(R.id.ivIncome);
        ivIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogIncome();
            }
        });

        ivExpense = findViewById(R.id.ivExpense);
        ivExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogExpense();
            }
        });
//End of menu listeners

    }

    //Income calculation functions
    private void addSavings() {
        editSavings = Integer.parseInt(String.valueOf(editSavings));
        tvSavingsBalance = Integer.parseInt(String.valueOf(tvSavingsBalance));
        tvSavingsTarget = editSavings + tvSavingsBalance;

    }
    private void subSavings() {

    }

    private void addInvestments() {

    }
    private void subInvestments() {

    }

    private void addInsurance() {

    }
    private void subInsurance() {

    }
    //Income calculation functions
    private void addRent() {

    }
    private void subRent() {

    }

    private void addBills() {

    }
    private void subBills() {

    }

    private void addEnjoyment() {

    }
    private void subEnjoyment() {

    }

    //Start of open and close functions
    private void showDialogSave() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.savings);

        Button btnCloseSave = dialog.findViewById(R.id.btnCloseSave);
        btnCloseSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void showDialogRent() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.rent);

        Button btnCloseRent = dialog.findViewById(R.id.btnCloseRent);
        btnCloseRent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void showDialogBills() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.bills);

        Button btnCloseBills = dialog.findViewById(R.id.btnCloseBills);
        btnCloseBills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void showDialogInvest() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.investment);

        Button btnCloseInvest = dialog.findViewById(R.id.btnCloseInvestment);
        btnCloseInvest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void showDialogInsurance() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.insurance);

        Button btnCloseInsurance = dialog.findViewById(R.id.btnCloseInsurance);
        btnCloseInsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void showDialogEnjoyment() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.enjoyment);

        Button btnCloseEnjoyment = dialog.findViewById(R.id.btnCloseEnjoyment);
        btnCloseEnjoyment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void showDialogIncome() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.income);

        Button btnCloseIncome = dialog.findViewById(R.id.btnCloseIncome);
        btnCloseIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void showDialogExpense() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.expense);

        Button btnCloseExpense = dialog.findViewById(R.id.btnCloseExpense);
        btnCloseExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
//End of open and close functions
}