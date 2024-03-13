package com.example.instagramactivity;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button num0 = findViewById(R.id.num0Btn);
        Button num1 = findViewById(R.id.num1Btn);
        Button num2 = findViewById(R.id.num2Btn);
        Button num3 = findViewById(R.id.num3Btn);
        Button num4 = findViewById(R.id.num4Btn);
        Button num5 = findViewById(R.id.num5Btn);
        Button num6 = findViewById(R.id.num6Btn);
        Button num7 = findViewById(R.id.num7Btn);
        Button num8 = findViewById(R.id.num8Btn);
        Button num9 = findViewById(R.id.num9Btn);
        Button equals = findViewById(R.id.equalsBtn);
        Button decimal = findViewById(R.id.decimalBtn);
        Button sign = findViewById(R.id.signBtn);
        Button addition = findViewById(R.id.additionBtn);
        Button subtraction = findViewById(R.id.subtractionBtn);
        Button multiplication = findViewById(R.id.multiplicationBtn);
        Button division = findViewById(R.id.divisionBtn);
        Button percentage = findViewById(R.id.percentageBtn);
        Button parentheses = findViewById(R.id.parenthesesBtn);
        Button clear = findViewById(R.id.clearBtn);
        TextView display = findViewById(R.id.displayTextView);

        Stack<String> stack = new Stack<>();

        num0.setOnClickListener(view -> {
            stack.push(String.valueOf(0));
            display.append("0");
            update(stack);
        });
        num1.setOnClickListener(view -> {
            stack.push(String.valueOf(1));
            display.append("1");
            update(stack);
        });
        num2.setOnClickListener(view -> {
            stack.push(String.valueOf(2));
            display.append("2");
            update(stack);
        });
        num3.setOnClickListener(view -> {
            stack.push(String.valueOf(3));
            display.append("3");
            update(stack);
        });
        num4.setOnClickListener(view -> {
            stack.push(String.valueOf(4));
            display.append("4");
            update(stack);
        });
        num5.setOnClickListener(view -> {
            stack.push(String.valueOf(5));
            display.append("5");
            update(stack);
        });
        num6.setOnClickListener(view -> {
            stack.push(String.valueOf(6));
            display.append("6");
            update(stack);
        });
        num7.setOnClickListener(view -> {
            stack.push(String.valueOf(7));
            display.append("7");
            update(stack);
        });
        num8.setOnClickListener(view -> {
            stack.push(String.valueOf(8));
            display.append("8");
            update(stack);
        });
        num9.setOnClickListener(view -> {
            stack.push(String.valueOf(9));
            display.append("9");
            update(stack);
        });
//        decimal.setOnClickListener(view -> {
//            stack.push(".");
//        });

        addition.setOnClickListener(view -> {
            int val1 = parseInt(stack.pop());
            int val2 = parseInt(stack.pop());
            stack.push(String.valueOf(val2 + val1));
            display.append(" + ");
            update(stack);
        });
        subtraction.setOnClickListener(view -> {
            int val1 = parseInt(stack.pop());
            int val2 = parseInt(stack.pop());
            stack.push(String.valueOf(val2 - val1));
            display.append(" - ");
            update(stack);
        });
        multiplication.setOnClickListener(view -> {
            int val1 = parseInt(stack.pop());
            int val2 = parseInt(stack.pop());
            stack.push(String.valueOf(val2 * val1));
            display.append(" * ");
            update(stack);
        });
        division.setOnClickListener(view -> {
            int val1 = parseInt(stack.pop());
            int val2 = parseInt(stack.pop());
            stack.push(String.valueOf(val2 / val1));
            display.append(" / ");
            update(stack);
        });
        equals.setOnClickListener(view -> {
            if(stack.size() == 1) {
                int res = parseInt(stack.pop());
                display.setText(res);
            } else {
                display.setText("Error");
            }
            update(stack);
        });
        clear.setOnClickListener(view -> {
            while(!stack.isEmpty()) {
                stack.pop();
            }
            display.setText("");
            update(stack);
        });
    }

    public void update(Stack stack) {
        for (Object element : stack) {
            System.out.println(element);
        }
    }
}