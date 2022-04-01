package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
android:weightSum="10"
tools:context=".MainActivity">
<TextView
android:id="@+id/tvsec"
android:layout_width="match_parent"
android:layout_height="0dp"
android:background="#000"
android:text=""
android:textColor="#f6f6f6"
android:textSize="30sp"
android:textAlignment="viewEnd"
android:padding="10dp"
android:gravity="bottom"
android:maxLines="1"
android:layout_weight="1">

</TextView>
<TextView
android:id="@+id/tvmain"
android:layout_width="match_parent"
android:layout_height="0dp"
android:background="#000"
android:text=""
android:textColor="#fff"
android:textSize="50sp"
android:textAlignment="viewEnd"
android:padding="10dp"
android:gravity="bottom"
android:maxLines="1"
android:layout_weight="2">

</TextView>
<LinearLayout
android:layout_weight="7"
android:orientation="vertical"
android:layout_width="match_parent"
android:layout_height="0dp">
<LinearLayout
android:orientation="vertical"
android:weightSum="7"
android:layout_width="match_parent"
android:layout_height="match_parent">
<LinearLayout
android:layout_weight="1"
android:orientation="horizontal"
android:layout_width="match_parent"
android:layout_height="match_parent">
<LinearLayout
android:orientation="horizontal"
android:weightSum="4"
android:layout_width="match_parent"
android:layout_height="match_parent">
<Button
android:id="@+id/bac"
android:text="AC"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/bc"
android:text="C"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/bb1"
android:text="("
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/bb2"
android:text=")"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
</LinearLayout>
</LinearLayout>
<LinearLayout
android:layout_weight="1"
android:orientation="horizontal"
android:layout_width="match_parent"
android:layout_height="match_parent">
<LinearLayout
android:orientation="horizontal"
android:weightSum="5"
android:layout_width="match_parent"
android:layout_height="match_parent">
<Button
android:id="@+id/bsin"
android:text="sin"
android:textAllCaps="false"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/bcos"
android:text="cos"
android:textAllCaps="false"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/btan"
android:text="tan"
android:textAllCaps="false"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/blog"
android:text="log"
android:textAllCaps="false"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/bln"
android:text="ln"
android:textAllCaps="false"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
</LinearLayout>
</LinearLayout>
<LinearLayout
android:layout_weight="1"
android:orientation="horizontal"
android:layout_width="match_parent"
android:layout_height="match_parent">
<LinearLayout
android:orientation="horizontal"
android:weightSum="5"
android:layout_width="match_parent"
android:layout_height="match_parent">
<Button
android:id="@+id/bfact"
android:text="x!"
android:textAllCaps="false"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/bsquare"
android:text="x²"
android:textAllCaps="false"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/bsqrt"
android:text="√"
android:textAllCaps="false"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/binv"
android:text="1/x"
android:textAllCaps="false"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/bdiv"
android:text="÷"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
</LinearLayout>
</LinearLayout>
<LinearLayout
android:layout_weight="1"
android:orientation="horizontal"
android:layout_width="match_parent"
android:layout_height="match_parent">
<LinearLayout
android:orientation="horizontal"
android:weightSum="4"
android:layout_width="match_parent"
android:layout_height="match_parent">
<Button
android:id="@+id/b7"
android:text="7"
android:textSize="30sp"
android:background="#000"
android:textColor="#fff"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/b8"
android:text="8"
android:textSize="30sp"
android:background="#000"
android:textColor="#fff"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/b9"
android:text="9"
android:textSize="30sp"
android:background="#000"
android:textColor="#fff"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/bmul"
android:text="×"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
</LinearLayout>
</LinearLayout>
<LinearLayout
android:layout_weight="1"
android:orientation="horizontal"
android:layout_width="match_parent"
android:layout_height="match_parent">
<LinearLayout
android:orientation="horizontal"
android:weightSum="4"
android:layout_width="match_parent"
android:layout_height="match_parent">
<Button
android:id="@+id/b4"
android:text="4"
android:textSize="30sp"
android:background="#000"
android:textColor="#fff"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/b5"
android:text="5"
android:textSize="30sp"
android:background="#000"
android:textColor="#fff"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/b6"
android:text="6"
android:textSize="30sp"
android:background="#000"
android:textColor="#fff"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/bmin"
android:text="-"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
</LinearLayout>
</LinearLayout>
<LinearLayout
android:layout_weight="1"
android:orientation="horizontal"
android:layout_width="match_parent"
android:layout_height="match_parent">
<LinearLayout
android:orientation="horizontal"
android:weightSum="4"
android:layout_width="match_parent"
android:layout_height="match_parent">
<Button
android:id="@+id/b1"
android:text="1"
android:textSize="30sp"
android:background="#000"
android:textColor="#fff"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/b2"
android:text="2"
android:textSize="30sp"
android:background="#000"
android:textColor="#fff"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/b3"
android:text="3"
android:textSize="30sp"
android:background="#000"
android:textColor="#fff"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/bplus"
android:text="+"
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
</LinearLayout>
</LinearLayout>
<LinearLayout
android:layout_weight="1"
android:orientation="horizontal"
android:layout_width="match_parent"
android:layout_height="match_parent">
<LinearLayout
android:orientation="horizontal"
android:weightSum="4"
android:layout_width="match_parent"
android:layout_height="match_parent">
<Button
android:id="@+id/bpi"
android:text="π"
android:textSize="30sp"
android:background="#000"
android:textColor="#fff"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/b0"
android:text="0"
android:textSize="30sp"
android:background="#000"
android:textColor="#fff"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/bdot"
android:text="."
android:textSize="30sp"
android:background="#000"
android:textColor="#fff"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
<Button
android:id="@+id/bequal"
android:text="="
android:textSize="30sp"
android:background="#000"
android:textColor="#ffa500"
android:layout_weight="1"
android:layout_width="match_parent"
android:layout_height="match_parent">

</Button>
</LinearLayout>
</LinearLayout>
</LinearLayout>
</LinearLayout>

</LinearLayout>
package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bpi,bequal,bplus,bmin,bmul,bdiv,binv,bsqrt,bsquare,bfact,bln,blog,btan,bcos,bsin,bb1,bb2,bc,bac;
    TextView tvmain,tvsec;
    String pi = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bpi = findViewById(R.id.bpi);
        bdot = findViewById(R.id.bdot);
        bequal = findViewById(R.id.bequal);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        binv = findViewById(R.id.binv);
        bsqrt = findViewById(R.id.bsqrt);
        bsquare = findViewById(R.id.bsquare);
        bfact = findViewById(R.id.bfact);
        bln = findViewById(R.id.bln);
        blog = findViewById(R.id.blog);
        btan = findViewById(R.id.btan);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        //onclick listeners
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                val = val.substring(0, val.length() - 1);
                tvmain.setText(val);
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"+");
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"-");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"×");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"÷");
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                tvmain.setText(String.valueOf(r));
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText()+pi);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"sin");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"cos");
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"tan");
            }
        });
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"^"+"(-1)");
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(tvmain.getText().toString());
                int fact = factorial(val);
                tvmain.setText(String.valueOf(fact));
                tvsec.setText(val+"!");
            }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvmain.getText().toString());
                double square = d*d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d+"²");
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"ln");
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"log");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                String replacedstr = val.replace('÷','/').replace('×','*');
                double result = eval(replacedstr);
                tvmain.setText(String.valueOf(result));
                tvsec.setText(val);
            }
        });

    }

    //factorial function
    int factorial(int n)
    {
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }


    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}