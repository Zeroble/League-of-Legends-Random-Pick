package com.d3v3lop3r.sup3r.m.i.lolrandomchampiontrollpick;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Button extends AppCompatActivity {
    int num;
    int spell1;
    int spell2;
    int line1;
    int line2;
    int item1;
    int item2;
    int item3;
    int item4;
    int item5;
    int item6;
    int item7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

    }

    public void pickButton(View v) {
        TextView textView = (TextView) findViewById(R.id.Schamp);
        num = ((int) (Math.random() * 132));
        num++;

        switch (num) {
            case 1:
                textView.setText("가렌");
                break;

            case 2:
                textView.setText("갈리오");
                break;

            case 3:
                textView.setText("갱플랭크");
                break;

            case 4:
                textView.setText("그라가스");
                break;

            case 5:
                textView.setText("그레이브즈");
                break;

            case 6:
                textView.setText("나르");
                break;

            case 7:
                textView.setText("나미");
                break;

            case 8:
                textView.setText("나서스");
                break;

            case 9:
                textView.setText("노틸러스");
                break;

            case 10:
                textView.setText("녹턴");
                break;

            case 11:
                textView.setText("누누");
                break;

            case 12:
                textView.setText("니달리");
                break;

            case 13:
                textView.setText("다리우스");
                break;

            case 14:
                textView.setText("다이애나");
                break;

            case 15:
                textView.setText("드레이븐");
                break;

            case 16:
                textView.setText("라이즈");
                break;

            case 17:
                textView.setText("람머스");
                break;

            case 18:
                textView.setText("럭스");
                break;

            case 19:
                textView.setText("럼블");
                break;

            case 20:
                textView.setText("레넥톤");
                break;

            case 21:
                textView.setText("레오나");
                break;

            case 22:
                textView.setText("렉사이");
                break;

            case 23:
                textView.setText("렝가");
                break;

            case 24:
                textView.setText("루시안");
                break;

            case 25:
                textView.setText("룰루");
                break;

            case 26:
                textView.setText("르블랑");
                break;

            case 27:
                textView.setText("리신");
                break;

            case 28:
                textView.setText("리븐");
                break;

            case 29:
                textView.setText("리산드라");
                break;

            case 30:
                textView.setText("마스터 이");
                break;

            case 31:
                textView.setText("마오카이");
                break;

            case 32:
                textView.setText("모데카이저");
                break;

            case 33:
                textView.setText("모르가나");
                break;

            case 34:
                textView.setText("문도");
                break;

            case 35:
                textView.setText("미스포춘");
                break;

            case 36:
                textView.setText("바드");
                break;

            case 37:
                textView.setText("바루스");
                break;

            case 38:
                textView.setText("바이");
                break;

            case 39:
                textView.setText("베이가");
                break;

            case 40:
                textView.setText("베인");
                break;

            case 41:
                textView.setText("벨코즈");
                break;

            case 42:
                textView.setText("볼리베어");
                break;

            case 43:
                textView.setText("브라움");
                break;

            case 44:
                textView.setText("브랜드");
                break;

            case 45:
                textView.setText("블라디미르");
                break;

            case 46:
                textView.setText("블리츠크랭크");
                break;

            case 47:
                textView.setText("빅토르");
                break;

            case 48:
                textView.setText("뽀삐");
                break;

            case 49:
                textView.setText("사이온");
                break;

            case 50:
                textView.setText("샤코");
                break;

            case 51:
                textView.setText("세주아니");
                break;

            case 52:
                textView.setText("소나");
                break;

            case 53:
                textView.setText("소라카");
                break;

            case 54:
                textView.setText("쉔");
                break;

            case 55:
                textView.setText("쉬바나");
                break;

            case 56:
                textView.setText("스웨인");
                break;

            case 57:
                textView.setText("스카너");
                break;

            case 58:
                textView.setText("시비르");
                break;

            case 59:
                textView.setText("신 짜오");
                break;

            case 60:
                textView.setText("신드라");
                break;

            case 61:
                textView.setText("신지드");
                break;

            case 62:
                textView.setText("쓰레쉬");
                break;

            case 63:
                textView.setText("아리");
                break;

            case 64:
                textView.setText("아무무");
                break;

            case 65:
                textView.setText("아우렐리온 솔");
                break;

            case 66:
                textView.setText("아지르");
                break;

            case 67:
                textView.setText("아칼리");
                break;

            case 68:
                textView.setText("아트록스");
                break;

            case 69:
                textView.setText("알리스타");
                break;

            case 70:
                textView.setText("애니");
                break;

            case 71:
                textView.setText("애니비아");
                break;

            case 72:
                textView.setText("애쉬");
                break;

            case 73:
                textView.setText("야스오");
                break;

            case 74:
                textView.setText("에코");
                break;

            case 75:
                textView.setText("엘리스");
                break;

            case 76:
                textView.setText("오공");
                break;

            case 77:
                textView.setText("오리아나");
                break;

            case 78:
                textView.setText("올라프");
                break;

            case 79:
                textView.setText("요릭");
                break;

            case 80:
                textView.setText("우디르");
                break;

            case 81:
                textView.setText("우르곳");
                break;

            case 82:
                textView.setText("워윅");
                break;

            case 83:
                textView.setText("이렐리아");
                break;

            case 84:
                textView.setText("이블린");
                break;

            case 85:
                textView.setText("피즈");
                break;

            case 86:
                textView.setText("하이머딩거");
                break;

            case 87:
                textView.setText("헤카림");
                break;

            case 88:
                textView.setText("탈리야");
                break;

            case 89:
                textView.setText("말자하");
                break;

            case 90:
                textView.setText("이즈리얼");
                break;

            case 91:
                textView.setText("일라오이");
                break;

            case 92:
                textView.setText("자르반");
                break;

            case 93:
                textView.setText("자이라");
                break;

            case 94:
                textView.setText("자크");
                break;

            case 95:
                textView.setText("잔나");
                break;

            case 96:
                textView.setText("잭스");
                break;

            case 97:
                textView.setText("제드");
                break;

            case 98:
                textView.setText("제라스");
                break;

            case 99:
                textView.setText("제이스");
                break;

            case 100:
                textView.setText("직스");
                break;

            case 101:
                textView.setText("진");
                break;

            case 102:
                textView.setText("질리언");
                break;

            case 103:
                textView.setText("징크스");
                break;

            case 104:
                textView.setText("초가스");
                break;

            case 105:
                textView.setText("카르마");
                break;

            case 106:
                textView.setText("카사딘");
                break;

            case 107:
                textView.setText("카서스");
                break;

            case 108:
                textView.setText("카시오페아");
                break;

            case 109:
                textView.setText("카직스");
                break;

            case 110:
                textView.setText("카타리나");
                break;

            case 111:
                textView.setText("칼리스타");
                break;

            case 112:
                textView.setText("케넨");
                break;

            case 113:
                textView.setText("케이틀린");
                break;

            case 114:
                textView.setText("케일");
                break;

            case 115:
                textView.setText("코그모");
                break;

            case 116:
                textView.setText("코르키");
                break;

            case 117:
                textView.setText("퀸");
                break;

            case 118:
                textView.setText("킨드레드");
                break;

            case 119:
                textView.setText("타릭");
                break;

            case 120:
                textView.setText("탈론");
                break;

            case 121:
                textView.setText("탐 켄치");
                break;

            case 122:
                textView.setText("트런들");
                break;

            case 123:
                textView.setText("트리스타나");
                break;

            case 124:
                textView.setText("트린다미어");
                break;

            case 125:
                textView.setText("트페");
                break;

            case 126:
                textView.setText("트위치");
                break;

            case 127:
                textView.setText("티모");
                break;

            case 128:
                textView.setText("판테온");
                break;

            case 129:
                textView.setText("피들스틱");
                break;

            case 130:
                textView.setText("피오라");
                break;

            case 131:
                textView.setText("그래이브즈");
                break;

            case 132:
                textView.setText("말파이트");
                break;
        }
        TextView lineView1 = (TextView) findViewById(R.id.showoriginline);
        Log.w("LOG", "랜덤1전");
        line1 = ((int) (Math.random() * 5));
        line1++;
        Log.w("LOG", "랜덤1후");
        switch (line1) {
            case 1:
                Log.w("LOG", "라인1-1");
                lineView1.setText("탑");
                break;

            case 2:
                lineView1.setText("미드");
                Log.w("LOG", "라인1-2");
                break;

            case 3:
                lineView1.setText("정글");
                Log.w("LOG", "라인1-3");
                break;

            case 4:
                lineView1.setText("원거리 딜러");
                Log.w("LOG", "라인1-4");
                break;

            case 5:
                lineView1.setText("서포터");
                Log.w("LOG", "라인1-5");
                break;
        }
        TextView lineView2 = (TextView) findViewById(R.id.showsubline);
        Log.w("LOG", "랜덤 2전");
        line2 = ((int) (Math.random() * 5));
        line2++;
        Log.w("LOG", "랜덤 2후");
        if (line1 == line2) {
            Log.w("LOG", "라인 2 if문입장");
            while (line1 == line2) {
                Log.w("LOG", "라인 2 while문입장");
                line2 = ((int) (Math.random() * 5));
                line2++;
                Log.w("LOG", "라인 2 while문랜덤 후" + line2);
            }
        }
        Log.w("LOG", "라인2 스위치문입장1");
        switch (line2) {
            case 1:
                lineView2.setText("탑");
                Log.w("LOG", "라인 2-1");
                break;

            case 2:
                lineView2.setText("미드");
                Log.w("LOG", "라인 2-2");
                break;

            case 3:
                lineView2.setText("정글");
                Log.w("LOG", "라인 2-3");
                break;

            case 4:
                lineView2.setText("원거리 딜러");
                Log.w("LOG", "라인 2-4");
                break;

            case 5:
                lineView2.setText("서포터");
                Log.w("LOG", "라인 2-5");
                break;
        }
        Log.w("LOG", "아몰랑씨바빡쳐");
        TextView spellView1 = (TextView) findViewById(R.id.showoriginspell);

        spell1 = ((int) (Math.random() * 8));
        spell1++;

        Log.w("LOG", "스펠1 랜덤돌림" + spell1);

        if (line1 == 3 || line2 == 3) {
            Log.w("LOG", "스펠1 강타if문 입장");
            spell1 = 9;
            Log.w("LOG", "스펠1 9설정됨" + spell1);

        }
        Log.w("LOG", "스위치 입장전");

        switch (spell1) {
            case 1:
                spellView1.setText("탈진");
                break;
            case 2:
                spellView1.setText("순간이동");
                break;
            case 3:
                spellView1.setText("점멸");
                break;
            case 4:
                spellView1.setText("유체화");
                break;
            case 5:
                spellView1.setText("회복");
                break;
            case 6:
                spellView1.setText("정화");
                break;
            case 7:
                spellView1.setText("점화");
                break;
            case 8:
                spellView1.setText("방어막");
                break;
            case 9:
                spellView1.setText("강타");
                break;
        }
        Log.w("LOG", "스위치 끝남");
        TextView spellView2 = (TextView) findViewById(R.id.showsubspell);
        spell2 = ((int) (Math.random() * 8));
        spell2++;
        if (spell1 == spell2) {
            while (spell1 == spell2) {
                Log.w("LOG", "스위치 입장전");
                spell2 = ((int) (Math.random() * 8));
                spell2++;
            }
        }
        switch (spell2) {
            case 1:
                spellView2.setText("탈진");
                break;
            case 2:
                spellView2.setText("순간이동");
                break;
            case 3:
                spellView2.setText("점멸");
                break;
            case 4:
                spellView2.setText("유체화");
                break;
            case 5:
                spellView2.setText("회복");
                break;
            case 6:
                spellView2.setText("정화");
                break;
            case 7:
                spellView2.setText("점화");
                break;
            case 8:
                spellView2.setText("방어막");
                break;
        }
        ImageView imageView1 = (ImageView) findViewById(R.id.showItem1);
        ImageView imageView2 = (ImageView) findViewById(R.id.showItem2);
        ImageView imageView3 = (ImageView) findViewById(R.id.showItem3);
        ImageView imageView4 = (ImageView) findViewById(R.id.showItem4);
        ImageView imageView5 = (ImageView) findViewById(R.id.showItem5);
        ImageView imageView6 = (ImageView) findViewById(R.id.showItem6);
        ImageView imageView7 = (ImageView) findViewById(R.id.showItem7);


        if (spell1 == 9) {
            item1 = ((int) (Math.random() * 12));
            item1++;
            switch (item1) {//정글템
                case 1:
                    Drawable q = getResources().getDrawable(R.drawable.jq);
                    imageView1.setImageDrawable(q);
                    break;
                case 2:
                    Drawable w = getResources().getDrawable(R.drawable.jw);
                    imageView1.setImageDrawable(w);
                    break;
                case 3:
                    Drawable e = getResources().getDrawable(R.drawable.je);
                    imageView1.setImageDrawable(e);
                    break;
                case 4:
                    Drawable r = getResources().getDrawable(R.drawable.jr);
                    imageView1.setImageDrawable(r);
                    break;
                case 5:
                    Drawable t = getResources().getDrawable(R.drawable.jt);
                    imageView1.setImageDrawable(t);
                    break;
                case 6:
                    Drawable y = getResources().getDrawable(R.drawable.jy);
                    imageView1.setImageDrawable(y);
                    break;
                case 7:
                    Drawable u = getResources().getDrawable(R.drawable.ju);
                    imageView1.setImageDrawable(u);
                    break;
                case 8:
                    Drawable i = getResources().getDrawable(R.drawable.ji);
                    imageView1.setImageDrawable(i);
                    break;
                case 9:
                    Drawable o = getResources().getDrawable(R.drawable.jo);
                    imageView1.setImageDrawable(o);
                    break;
                case 10:
                    Drawable drawable = getResources().getDrawable(R.drawable.js);
                    imageView1.setImageDrawable(drawable);
                    break;
                case 11:
                    Drawable p = getResources().getDrawable(R.drawable.jp);
                    imageView1.setImageDrawable(p);
                    break;
                case 12:
                    Drawable a = getResources().getDrawable(R.drawable.ja);
                    imageView1.setImageDrawable(a);
                    break;
            }
        }

        else {//라인==정글이 아닐때
            item1 = ((int) (Math.random() * 60));
            item1++;
            switch (item1) {
                case 1:
                    Drawable drawable = getResources().getDrawable(R.drawable.q);
                    imageView1.setImageDrawable(drawable);
                    break;
                case 2:
                    Drawable q = getResources().getDrawable(R.drawable.w);
                    imageView1.setImageDrawable(q);
                    break;
                case 3:
                    Drawable e = getResources().getDrawable(R.drawable.e);
                    imageView1.setImageDrawable(e);
                    break;
                case 4:
                    Drawable r = getResources().getDrawable(R.drawable.r);
                    imageView1.setImageDrawable(r);
                    break;
                case 5:
                    Drawable t = getResources().getDrawable(R.drawable.t);
                    imageView1.setImageDrawable(t);
                    break;
                case 6:
                    Drawable wg = getResources().getDrawable(R.drawable.wg);
                    imageView1.setImageDrawable(wg);
                    break;
                case 7:
                    Drawable d = getResources().getDrawable(R.drawable.d);
                    imageView1.setImageDrawable(d);
                    break;
                case 8:
                    Drawable f = getResources().getDrawable(R.drawable.f);
                    imageView1.setImageDrawable(f);
                    break;
                case 9:
                    Drawable g = getResources().getDrawable(R.drawable.g);
                    imageView1.setImageDrawable(g);
                    break;
                case 10:
                    Drawable wh = getResources().getDrawable(R.drawable.wh);
                    imageView1.setImageDrawable(wh);
                    break;
                case 11:
                    Drawable wj = getResources().getDrawable(R.drawable.wj);
                    imageView1.setImageDrawable(wj);
                    break;
                case 12:
                    Drawable wk = getResources().getDrawable(R.drawable.wk);
                    imageView1.setImageDrawable(wk);
                    break;
                case 13:
                    Drawable wl = getResources().getDrawable(R.drawable.wl);
                    imageView1.setImageDrawable(wl);
                    break;
                case 14:
                    Drawable wz = getResources().getDrawable(R.drawable.wz);
                    imageView1.setImageDrawable(wz);
                    break;
                case 15:
                    Drawable wx = getResources().getDrawable(R.drawable.wx);
                    imageView1.setImageDrawable(wx);
                    break;
                case 16:
                    Drawable h = getResources().getDrawable(R.drawable.h);
                    imageView1.setImageDrawable(h);
                    break;
                case 17:
                    Drawable j = getResources().getDrawable(R.drawable.j);
                    imageView1.setImageDrawable(j);
                    break;
                case 18:
                    Drawable k = getResources().getDrawable(R.drawable.k);
                    imageView1.setImageDrawable(k);
                    break;
                case 19:
                    Drawable l = getResources().getDrawable(R.drawable.l);
                    imageView1.setImageDrawable(l);
                    break;
                case 20:
                    Drawable z = getResources().getDrawable(R.drawable.z);
                    imageView1.setImageDrawable(z);
                    break;
                case 21:
                    Drawable x = getResources().getDrawable(R.drawable.x);
                    imageView1.setImageDrawable(x);
                    break;
                case 22:
                    Drawable c = getResources().getDrawable(R.drawable.c);
                    imageView1.setImageDrawable(c);
                    break;
                case 23:
                    Drawable vv = getResources().getDrawable(R.drawable.v);
                    imageView1.setImageDrawable(vv);
                    break;
                case 24:
                    Drawable b = getResources().getDrawable(R.drawable.b);
                    imageView1.setImageDrawable(b);
                    break;
                case 25:
                    Drawable n = getResources().getDrawable(R.drawable.n);
                    imageView1.setImageDrawable(n);
                    break;
                case 26:
                    Drawable m = getResources().getDrawable(R.drawable.m);
                    imageView1.setImageDrawable(m);
                    break;
                case 27:
                    Drawable qq = getResources().getDrawable(R.drawable.qq);
                    imageView1.setImageDrawable(qq);
                    break;
                case 28:
                    Drawable qw = getResources().getDrawable(R.drawable.qw);
                    imageView1.setImageDrawable(qw);
                    break;
                case 29:
                    Drawable qe = getResources().getDrawable(R.drawable.qe);
                    imageView1.setImageDrawable(qe);
                    break;
                case 30:
                    Drawable qr = getResources().getDrawable(R.drawable.qr);
                    imageView1.setImageDrawable(qr);
                    break;
                case 31:
                    Drawable qt = getResources().getDrawable(R.drawable.qt);
                    imageView1.setImageDrawable(qt);
                    break;
                case 32:
                    Drawable qy = getResources().getDrawable(R.drawable.qy);
                    imageView1.setImageDrawable(qy);
                    break;
                case 33:
                    Drawable qu = getResources().getDrawable(R.drawable.qu);
                    imageView1.setImageDrawable(qu);
                    break;
                case 34:
                    Drawable qi = getResources().getDrawable(R.drawable.qi);
                    imageView1.setImageDrawable(qi);
                    break;
                case 35:
                    Drawable qo = getResources().getDrawable(R.drawable.qo);
                    imageView1.setImageDrawable(qo);
                    break;
                case 36:
                    Drawable qp = getResources().getDrawable(R.drawable.qp);
                    imageView1.setImageDrawable(qp);
                    break;
                case 37:
                    Drawable qa = getResources().getDrawable(R.drawable.qa);
                    imageView1.setImageDrawable(qa);
                    break;
                case 38:
                    Drawable qs = getResources().getDrawable(R.drawable.qs);
                    imageView1.setImageDrawable(qs);
                    break;
                case 39:
                    Drawable qd = getResources().getDrawable(R.drawable.qd);
                    imageView1.setImageDrawable(qd);
                    break;
                case 40:
                    Drawable qf = getResources().getDrawable(R.drawable.qf);
                    imageView1.setImageDrawable(qf);
                    break;
                case 41:
                    Drawable qg = getResources().getDrawable(R.drawable.qg);
                    imageView1.setImageDrawable(qg);
                    break;
                case 42:
                    Drawable qh = getResources().getDrawable(R.drawable.qh);
                    imageView1.setImageDrawable(qh);
                    break;
                case 43:
                    Drawable qj = getResources().getDrawable(R.drawable.qj);
                    imageView1.setImageDrawable(qj);
                    break;
                case 44:
                    Drawable qk = getResources().getDrawable(R.drawable.qk);
                    imageView1.setImageDrawable(qk);
                    break;
                case 45:
                    Drawable ql = getResources().getDrawable(R.drawable.ql);
                    imageView1.setImageDrawable(ql);
                    break;
                case 46:
                    Drawable qz = getResources().getDrawable(R.drawable.qz);
                    imageView1.setImageDrawable(qz);
                    break;
                case 47:
                    Drawable qx = getResources().getDrawable(R.drawable.qx);
                    imageView1.setImageDrawable(qx);
                    break;
                case 48:
                    Drawable qc = getResources().getDrawable(R.drawable.qc);
                    imageView1.setImageDrawable(qc);
                    break;
                case 49:
                    Drawable qv = getResources().getDrawable(R.drawable.qv);
                    imageView1.setImageDrawable(qv);
                    break;
                case 50:
                    Drawable qb = getResources().getDrawable(R.drawable.qb);
                    imageView1.setImageDrawable(qb);
                    break;
                case 51:
                    Drawable qn = getResources().getDrawable(R.drawable.qn);
                    imageView1.setImageDrawable(qn);
                    break;
                case 52:
                    Drawable qm = getResources().getDrawable(R.drawable.qm);
                    imageView1.setImageDrawable(qm);
                    break;
                case 53:
                    Drawable wq = getResources().getDrawable(R.drawable.wq);
                    imageView1.setImageDrawable(wq);
                    break;
                case 54:
                    Drawable ww = getResources().getDrawable(R.drawable.ww);
                    imageView1.setImageDrawable(ww);
                    break;
                case 55:
                    Drawable we = getResources().getDrawable(R.drawable.we);
                    imageView1.setImageDrawable(we);
                    break;
                case 56:
                    Drawable wr = getResources().getDrawable(R.drawable.wr);
                    imageView1.setImageDrawable(wr);
                    break;
                case 57:
                    Drawable wt = getResources().getDrawable(R.drawable.wt);
                    imageView1.setImageDrawable(wt);
                    break;
                case 58:
                    Drawable wy = getResources().getDrawable(R.drawable.wy);
                    imageView1.setImageDrawable(wy);
                    break;
                case 59:
                    Drawable wf = getResources().getDrawable(R.drawable.wf);
                    imageView1.setImageDrawable(wf);
                    break;
                case 60:
                    Drawable wc = getResources().getDrawable(R.drawable.wc);
                    imageView1.setImageDrawable(wc);
                    break;
            }
        }
        item2 = ((int) (Math.random() * 60));
        item2++;
        if (item1 == item2) {
            while (item1 == item2) {
                item2 = ((int) (Math.random() * 60));
                item2++;
            }
        }

            switch (item2) {
                case 1:
                    Drawable drawable = getResources().getDrawable(R.drawable.q);
                    imageView2.setImageDrawable(drawable);
                    break;
                case 2:
                    Drawable q = getResources().getDrawable(R.drawable.w);
                    imageView2.setImageDrawable(q);
                    break;
                case 3:
                    Drawable e = getResources().getDrawable(R.drawable.e);
                    imageView2.setImageDrawable(e);
                    break;
                case 4:
                    Drawable r = getResources().getDrawable(R.drawable.r);
                    imageView2.setImageDrawable(r);
                    break;
                case 5:
                    Drawable t = getResources().getDrawable(R.drawable.t);
                    imageView2.setImageDrawable(t);
                    break;
                case 6:
                    Drawable wg = getResources().getDrawable(R.drawable.wg);
                    imageView2.setImageDrawable(wg);
                    break;
                case 7:
                    Drawable d = getResources().getDrawable(R.drawable.d);
                    imageView2.setImageDrawable(d);
                    break;
                case 8:
                    Drawable f = getResources().getDrawable(R.drawable.f);
                    imageView2.setImageDrawable(f);
                    break;
                case 9:
                    Drawable g = getResources().getDrawable(R.drawable.g);
                    imageView2.setImageDrawable(g);
                    break;
                case 10:
                    Drawable wh = getResources().getDrawable(R.drawable.wh);
                    imageView2.setImageDrawable(wh);
                    break;
                case 11:
                    Drawable wj = getResources().getDrawable(R.drawable.wj);
                    imageView2.setImageDrawable(wj);
                    break;
                case 12:
                    Drawable wk = getResources().getDrawable(R.drawable.wk);
                    imageView2.setImageDrawable(wk);
                    break;
                case 13:
                    Drawable wl = getResources().getDrawable(R.drawable.wl);
                    imageView2.setImageDrawable(wl);
                    break;
                case 14:
                    Drawable wz = getResources().getDrawable(R.drawable.wz);
                    imageView2.setImageDrawable(wz);
                    break;
                case 15:
                    Drawable wx = getResources().getDrawable(R.drawable.wx);
                    imageView2.setImageDrawable(wx);
                    break;
                case 16:
                    Drawable h = getResources().getDrawable(R.drawable.h);
                    imageView2.setImageDrawable(h);
                    break;
                case 17:
                    Drawable j = getResources().getDrawable(R.drawable.j);
                    imageView2.setImageDrawable(j);
                    break;
                case 18:
                    Drawable k = getResources().getDrawable(R.drawable.k);
                    imageView2.setImageDrawable(k);
                    break;
                case 19:
                    Drawable l = getResources().getDrawable(R.drawable.l);
                    imageView2.setImageDrawable(l);
                    break;
                case 20:
                    Drawable z = getResources().getDrawable(R.drawable.z);
                    imageView2.setImageDrawable(z);
                    break;
                case 21:
                    Drawable x = getResources().getDrawable(R.drawable.x);
                    imageView2.setImageDrawable(x);
                    break;
                case 22:
                    Drawable c = getResources().getDrawable(R.drawable.c);
                    imageView2.setImageDrawable(c);
                    break;
                case 23:
                    Drawable vv = getResources().getDrawable(R.drawable.v);
                    imageView2.setImageDrawable(vv);
                    break;
                case 24:
                    Drawable b = getResources().getDrawable(R.drawable.b);
                    imageView2.setImageDrawable(b);
                    break;
                case 25:
                    Drawable n = getResources().getDrawable(R.drawable.n);
                    imageView2.setImageDrawable(n);
                    break;
                case 26:
                    Drawable m = getResources().getDrawable(R.drawable.m);
                    imageView2.setImageDrawable(m);
                    break;
                case 27:
                    Drawable qq = getResources().getDrawable(R.drawable.qq);
                    imageView2.setImageDrawable(qq);
                    break;
                case 28:
                    Drawable qw = getResources().getDrawable(R.drawable.qw);
                    imageView2.setImageDrawable(qw);
                    break;
                case 29:
                    Drawable qe = getResources().getDrawable(R.drawable.qe);
                    imageView2.setImageDrawable(qe);
                    break;
                case 30:
                    Drawable qr = getResources().getDrawable(R.drawable.qr);
                    imageView2.setImageDrawable(qr);
                    break;
                case 31:
                    Drawable qt = getResources().getDrawable(R.drawable.qt);
                    imageView2.setImageDrawable(qt);
                    break;
                case 32:
                    Drawable qy = getResources().getDrawable(R.drawable.qy);
                    imageView2.setImageDrawable(qy);
                    break;
                case 33:
                    Drawable qu = getResources().getDrawable(R.drawable.qu);
                    imageView2.setImageDrawable(qu);
                    break;
                case 34:
                    Drawable qi = getResources().getDrawable(R.drawable.qi);
                    imageView2.setImageDrawable(qi);
                    break;
                case 35:
                    Drawable qo = getResources().getDrawable(R.drawable.qo);
                    imageView2.setImageDrawable(qo);
                    break;
                case 36:
                    Drawable qp = getResources().getDrawable(R.drawable.qp);
                    imageView2.setImageDrawable(qp);
                    break;
                case 37:
                    Drawable qa = getResources().getDrawable(R.drawable.qa);
                    imageView2.setImageDrawable(qa);
                    break;
                case 38:
                    Drawable qs = getResources().getDrawable(R.drawable.qs);
                    imageView2.setImageDrawable(qs);
                    break;
                case 39:
                    Drawable qd = getResources().getDrawable(R.drawable.qd);
                    imageView2.setImageDrawable(qd);
                    break;
                case 40:
                    Drawable qf = getResources().getDrawable(R.drawable.qf);
                    imageView2.setImageDrawable(qf);
                    break;
                case 41:
                    Drawable qg = getResources().getDrawable(R.drawable.qg);
                    imageView2.setImageDrawable(qg);
                    break;
                case 42:
                    Drawable qh = getResources().getDrawable(R.drawable.qh);
                    imageView2.setImageDrawable(qh);
                    break;
                case 43:
                    Drawable qj = getResources().getDrawable(R.drawable.qj);
                    imageView2.setImageDrawable(qj);
                    break;
                case 44:
                    Drawable qk = getResources().getDrawable(R.drawable.qk);
                    imageView2.setImageDrawable(qk);
                    break;
                case 45:
                    Drawable ql = getResources().getDrawable(R.drawable.ql);
                    imageView2.setImageDrawable(ql);
                    break;
                case 46:
                    Drawable qz = getResources().getDrawable(R.drawable.qz);
                    imageView2.setImageDrawable(qz);
                    break;
                case 47:
                    Drawable qx = getResources().getDrawable(R.drawable.qx);
                    imageView2.setImageDrawable(qx);
                    break;
                case 48:
                    Drawable qc = getResources().getDrawable(R.drawable.qc);
                    imageView2.setImageDrawable(qc);
                    break;
                case 49:
                    Drawable qv = getResources().getDrawable(R.drawable.qv);
                    imageView2.setImageDrawable(qv);
                    break;
                case 50:
                    Drawable qb = getResources().getDrawable(R.drawable.qb);
                    imageView2.setImageDrawable(qb);
                    break;
                case 51:
                    Drawable qn = getResources().getDrawable(R.drawable.qn);
                    imageView2.setImageDrawable(qn);
                    break;
                case 52:
                    Drawable qm = getResources().getDrawable(R.drawable.qm);
                    imageView2.setImageDrawable(qm);
                    break;
                case 53:
                    Drawable wq = getResources().getDrawable(R.drawable.wq);
                    imageView2.setImageDrawable(wq);
                    break;
                case 54:
                    Drawable ww = getResources().getDrawable(R.drawable.ww);
                    imageView2.setImageDrawable(ww);
                    break;
                case 55:
                    Drawable we = getResources().getDrawable(R.drawable.we);
                    imageView2.setImageDrawable(we);
                    break;
                case 56:
                    Drawable wr = getResources().getDrawable(R.drawable.wr);
                    imageView2.setImageDrawable(wr);
                    break;
                case 57:
                    Drawable wt = getResources().getDrawable(R.drawable.wt);
                    imageView2.setImageDrawable(wt);
                    break;
                case 58:
                    Drawable wy = getResources().getDrawable(R.drawable.wy);
                    imageView2.setImageDrawable(wy);
                    break;
                case 59:
                    Drawable wf = getResources().getDrawable(R.drawable.wf);
                    imageView2.setImageDrawable(wf);
                    break;
                case 60:
                    Drawable wc = getResources().getDrawable(R.drawable.wc);
                    imageView2.setImageDrawable(wc);
                    break;
            }
        if (num == 47) {//빅토르일때 마법공학핵
            Drawable q = getResources().getDrawable(R.drawable.hexcore);
            imageView2.setImageDrawable(q);
        }

        item3 = ((int) (Math.random() * 60));
        item3++;
        if (item1 == item3 | item2 == item3) {
            while (item1 == item3 | item2 == item3) {
                item3 = ((int) (Math.random() * 60));
                item3++;
            }
        }
        switch (item3) {
            case 1:
                Drawable drawable = getResources().getDrawable(R.drawable.q);
                imageView3.setImageDrawable(drawable);
                break;
            case 2:
                Drawable q = getResources().getDrawable(R.drawable.w);
                imageView3.setImageDrawable(q);
                break;
            case 3:
                Drawable e = getResources().getDrawable(R.drawable.e);
                imageView3.setImageDrawable(e);
                break;
            case 4:
                Drawable r = getResources().getDrawable(R.drawable.r);
                imageView3.setImageDrawable(r);
                break;
            case 5:
                Drawable t = getResources().getDrawable(R.drawable.t);
                imageView3.setImageDrawable(t);
                break;
            case 6:
                Drawable wg = getResources().getDrawable(R.drawable.wg);
                imageView3.setImageDrawable(wg);
                break;
            case 7:
                Drawable d = getResources().getDrawable(R.drawable.d);
                imageView3.setImageDrawable(d);
                break;
            case 8:
                Drawable f = getResources().getDrawable(R.drawable.f);
                imageView3.setImageDrawable(f);
                break;
            case 9:
                Drawable g = getResources().getDrawable(R.drawable.g);
                imageView3.setImageDrawable(g);
                break;
            case 10:
                Drawable wh = getResources().getDrawable(R.drawable.wh);
                imageView3.setImageDrawable(wh);
                break;
            case 11:
                Drawable wj = getResources().getDrawable(R.drawable.wj);
                imageView3.setImageDrawable(wj);
                break;
            case 12:
                Drawable wk = getResources().getDrawable(R.drawable.wk);
                imageView3.setImageDrawable(wk);
                break;
            case 13:
                Drawable wl = getResources().getDrawable(R.drawable.wl);
                imageView3.setImageDrawable(wl);
                break;
            case 14:
                Drawable wz = getResources().getDrawable(R.drawable.wz);
                imageView3.setImageDrawable(wz);
                break;
            case 15:
                Drawable wx = getResources().getDrawable(R.drawable.wx);
                imageView3.setImageDrawable(wx);
                break;
            case 16:
                Drawable h = getResources().getDrawable(R.drawable.h);
                imageView3.setImageDrawable(h);
                break;
            case 17:
                Drawable j = getResources().getDrawable(R.drawable.j);
                imageView3.setImageDrawable(j);
                break;
            case 18:
                Drawable k = getResources().getDrawable(R.drawable.k);
                imageView3.setImageDrawable(k);
                break;
            case 19:
                Drawable l = getResources().getDrawable(R.drawable.l);
                imageView3.setImageDrawable(l);
                break;
            case 20:
                Drawable z = getResources().getDrawable(R.drawable.z);
                imageView3.setImageDrawable(z);
                break;
            case 21:
                Drawable x = getResources().getDrawable(R.drawable.x);
                imageView3.setImageDrawable(x);
                break;
            case 22:
                Drawable c = getResources().getDrawable(R.drawable.c);
                imageView3.setImageDrawable(c);
                break;
            case 23:
                Drawable vv = getResources().getDrawable(R.drawable.v);
                imageView3.setImageDrawable(vv);
                break;
            case 24:
                Drawable b = getResources().getDrawable(R.drawable.b);
                imageView3.setImageDrawable(b);
                break;
            case 25:
                Drawable n = getResources().getDrawable(R.drawable.n);
                imageView3.setImageDrawable(n);
                break;
            case 26:
                Drawable m = getResources().getDrawable(R.drawable.m);
                imageView3.setImageDrawable(m);
                break;
            case 27:
                Drawable qq = getResources().getDrawable(R.drawable.qq);
                imageView3.setImageDrawable(qq);
                break;
            case 28:
                Drawable qw = getResources().getDrawable(R.drawable.qw);
                imageView3.setImageDrawable(qw);
                break;
            case 29:
                Drawable qe = getResources().getDrawable(R.drawable.qe);
                imageView3.setImageDrawable(qe);
                break;
            case 30:
                Drawable qr = getResources().getDrawable(R.drawable.qr);
                imageView3.setImageDrawable(qr);
                break;
            case 31:
                Drawable qt = getResources().getDrawable(R.drawable.qt);
                imageView3.setImageDrawable(qt);
                break;
            case 32:
                Drawable qy = getResources().getDrawable(R.drawable.qy);
                imageView3.setImageDrawable(qy);
                break;
            case 33:
                Drawable qu = getResources().getDrawable(R.drawable.qu);
                imageView3.setImageDrawable(qu);
                break;
            case 34:
                Drawable qi = getResources().getDrawable(R.drawable.qi);
                imageView3.setImageDrawable(qi);
                break;
            case 35:
                Drawable qo = getResources().getDrawable(R.drawable.qo);
                imageView3.setImageDrawable(qo);
                break;
            case 36:
                Drawable qp = getResources().getDrawable(R.drawable.qp);
                imageView3.setImageDrawable(qp);
                break;
            case 37:
                Drawable qa = getResources().getDrawable(R.drawable.qa);
                imageView3.setImageDrawable(qa);
                break;
            case 38:
                Drawable qs = getResources().getDrawable(R.drawable.qs);
                imageView3.setImageDrawable(qs);
                break;
            case 39:
                Drawable qd = getResources().getDrawable(R.drawable.qd);
                imageView3.setImageDrawable(qd);
                break;
            case 40:
                Drawable qf = getResources().getDrawable(R.drawable.qf);
                imageView3.setImageDrawable(qf);
                break;
            case 41:
                Drawable qg = getResources().getDrawable(R.drawable.qg);
                imageView3.setImageDrawable(qg);
                break;
            case 42:
                Drawable qh = getResources().getDrawable(R.drawable.qh);
                imageView3.setImageDrawable(qh);
                break;
            case 43:
                Drawable qj = getResources().getDrawable(R.drawable.qj);
                imageView3.setImageDrawable(qj);
                break;
            case 44:
                Drawable qk = getResources().getDrawable(R.drawable.qk);
                imageView3.setImageDrawable(qk);
                break;
            case 45:
                Drawable ql = getResources().getDrawable(R.drawable.ql);
                imageView3.setImageDrawable(ql);
                break;
            case 46:
                Drawable qz = getResources().getDrawable(R.drawable.qz);
                imageView3.setImageDrawable(qz);
                break;
            case 47:
                Drawable qx = getResources().getDrawable(R.drawable.qx);
                imageView3.setImageDrawable(qx);
                break;
            case 48:
                Drawable qc = getResources().getDrawable(R.drawable.qc);
                imageView3.setImageDrawable(qc);
                break;
            case 49:
                Drawable qv = getResources().getDrawable(R.drawable.qv);
                imageView3.setImageDrawable(qv);
                break;
            case 50:
                Drawable qb = getResources().getDrawable(R.drawable.qb);
                imageView3.setImageDrawable(qb);
                break;
            case 51:
                Drawable qn = getResources().getDrawable(R.drawable.qn);
                imageView3.setImageDrawable(qn);
                break;
            case 52:
                Drawable qm = getResources().getDrawable(R.drawable.qm);
                imageView3.setImageDrawable(qm);
                break;
            case 53:
                Drawable wq = getResources().getDrawable(R.drawable.wq);
                imageView3.setImageDrawable(wq);
                break;
            case 54:
                Drawable ww = getResources().getDrawable(R.drawable.ww);
                imageView3.setImageDrawable(ww);
                break;
            case 55:
                Drawable we = getResources().getDrawable(R.drawable.we);
                imageView3.setImageDrawable(we);
                break;
            case 56:
                Drawable wr = getResources().getDrawable(R.drawable.wr);
                imageView3.setImageDrawable(wr);
                break;
            case 57:
                Drawable wt = getResources().getDrawable(R.drawable.wt);
                imageView3.setImageDrawable(wt);
                break;
            case 58:
                Drawable wy = getResources().getDrawable(R.drawable.wy);
                imageView3.setImageDrawable(wy);
                break;
            case 59:
                Drawable wf = getResources().getDrawable(R.drawable.wf);
                imageView3.setImageDrawable(wf);
                break;
            case 60:
                Drawable wc = getResources().getDrawable(R.drawable.wc);
                imageView3.setImageDrawable(wc);
                break;
        }
        if(line1==5|line2==5){
            item3 = ((int) (Math.random() * 2));
            item3++;
            Log.w("LOG", "서포터일때나온 수" + item3);
            switch (item3)
            {
                case 1:
                    item3 = ((int) (Math.random() * 4));
                    item3++;
                    Log.w("LOG", "case1" + item3);
                    switch (item3)
                    {
                        case 1:
                            Drawable q = getResources().getDrawable(R.drawable.ws);
                            imageView3.setImageDrawable(q);
                            break;
                        case 2:
                            Drawable w = getResources().getDrawable(R.drawable.wo);
                            imageView3.setImageDrawable(w);
                            break;
                        case 3:
                            Drawable e = getResources().getDrawable(R.drawable.wi);
                            imageView3.setImageDrawable(e);
                            break;
                        case 4:
                            Drawable r = getResources().getDrawable(R.drawable.wu);
                            imageView3.setImageDrawable(r);
                            break;
                    }
                    break;
                case 2:
                    item3 = ((int) (Math.random() * 3));
                    item3++;
                    Log.w("LOG", "case2" + item3);
                    switch (item3) {
                        case 1:
                            Drawable q = getResources().getDrawable(R.drawable.wd);
                            imageView3.setImageDrawable(q);
                            break;
                        case 2:
                            Drawable w = getResources().getDrawable(R.drawable.wa);
                            imageView3.setImageDrawable(w);
                            break;
                        case 3:
                            Drawable e = getResources().getDrawable(R.drawable.wp);
                            imageView3.setImageDrawable(e);
                            break;
                    }
            }
        }
        item4 = ((int) (Math.random() * 60));
        item4++;
        if (item2 == item4 | item1 == item4 | item3 == item4) {
            while (item2 == item4 | item1 == item4 | item3 == item4) {
                item4 = ((int) (Math.random() * 60));
                item4++;
            }
        }
        switch (item4) {
            case 1:
                Drawable drawable = getResources().getDrawable(R.drawable.q);
                imageView4.setImageDrawable(drawable);
                break;
            case 2:
                Drawable q = getResources().getDrawable(R.drawable.w);
                imageView4.setImageDrawable(q);
                break;
            case 3:
                Drawable e = getResources().getDrawable(R.drawable.e);
                imageView4.setImageDrawable(e);
                break;
            case 4:
                Drawable r = getResources().getDrawable(R.drawable.r);
                imageView4.setImageDrawable(r);
                break;
            case 5:
                Drawable t = getResources().getDrawable(R.drawable.t);
                imageView4.setImageDrawable(t);
                break;
            case 6:
                Drawable wg = getResources().getDrawable(R.drawable.wg);
                imageView4.setImageDrawable(wg);
                break;
            case 7:
                Drawable d = getResources().getDrawable(R.drawable.d);
                imageView4.setImageDrawable(d);
                break;
            case 8:
                Drawable f = getResources().getDrawable(R.drawable.f);
                imageView4.setImageDrawable(f);
                break;
            case 9:
                Drawable g = getResources().getDrawable(R.drawable.g);
                imageView4.setImageDrawable(g);
                break;
            case 10:
                Drawable wh = getResources().getDrawable(R.drawable.wh);
                imageView4.setImageDrawable(wh);
                break;
            case 11:
                Drawable wj = getResources().getDrawable(R.drawable.wj);
                imageView4.setImageDrawable(wj);
                break;
            case 12:
                Drawable wk = getResources().getDrawable(R.drawable.wk);
                imageView4.setImageDrawable(wk);
                break;
            case 13:
                Drawable wl = getResources().getDrawable(R.drawable.wl);
                imageView4.setImageDrawable(wl);
                break;
            case 14:
                Drawable wz = getResources().getDrawable(R.drawable.wz);
                imageView4.setImageDrawable(wz);
                break;
            case 15:
                Drawable wx = getResources().getDrawable(R.drawable.wx);
                imageView4.setImageDrawable(wx);
                break;
            case 16:
                Drawable h = getResources().getDrawable(R.drawable.h);
                imageView4.setImageDrawable(h);
                break;
            case 17:
                Drawable j = getResources().getDrawable(R.drawable.j);
                imageView4.setImageDrawable(j);
                break;
            case 18:
                Drawable k = getResources().getDrawable(R.drawable.k);
                imageView4.setImageDrawable(k);
                break;
            case 19:
                Drawable l = getResources().getDrawable(R.drawable.l);
                imageView4.setImageDrawable(l);
                break;
            case 20:
                Drawable z = getResources().getDrawable(R.drawable.z);
                imageView4.setImageDrawable(z);
                break;
            case 21:
                Drawable x = getResources().getDrawable(R.drawable.x);
                imageView4.setImageDrawable(x);
                break;
            case 22:
                Drawable c = getResources().getDrawable(R.drawable.c);
                imageView4.setImageDrawable(c);
                break;
            case 23:
                Drawable vv = getResources().getDrawable(R.drawable.v);
                imageView4.setImageDrawable(vv);
                break;
            case 24:
                Drawable b = getResources().getDrawable(R.drawable.b);
                imageView4.setImageDrawable(b);
                break;
            case 25:
                Drawable n = getResources().getDrawable(R.drawable.n);
                imageView4.setImageDrawable(n);
                break;
            case 26:
                Drawable m = getResources().getDrawable(R.drawable.m);
                imageView4.setImageDrawable(m);
                break;
            case 27:
                Drawable qq = getResources().getDrawable(R.drawable.qq);
                imageView4.setImageDrawable(qq);
                break;
            case 28:
                Drawable qw = getResources().getDrawable(R.drawable.qw);
                imageView4.setImageDrawable(qw);
                break;
            case 29:
                Drawable qe = getResources().getDrawable(R.drawable.qe);
                imageView4.setImageDrawable(qe);
                break;
            case 30:
                Drawable qr = getResources().getDrawable(R.drawable.qr);
                imageView4.setImageDrawable(qr);
                break;
            case 31:
                Drawable qt = getResources().getDrawable(R.drawable.qt);
                imageView4.setImageDrawable(qt);
                break;
            case 32:
                Drawable qy = getResources().getDrawable(R.drawable.qy);
                imageView4.setImageDrawable(qy);
                break;
            case 33:
                Drawable qu = getResources().getDrawable(R.drawable.qu);
                imageView4.setImageDrawable(qu);
                break;
            case 34:
                Drawable qi = getResources().getDrawable(R.drawable.qi);
                imageView4.setImageDrawable(qi);
                break;
            case 35:
                Drawable qo = getResources().getDrawable(R.drawable.qo);
                imageView4.setImageDrawable(qo);
                break;
            case 36:
                Drawable qp = getResources().getDrawable(R.drawable.qp);
                imageView4.setImageDrawable(qp);
                break;
            case 37:
                Drawable qa = getResources().getDrawable(R.drawable.qa);
                imageView4.setImageDrawable(qa);
                break;
            case 38:
                Drawable qs = getResources().getDrawable(R.drawable.qs);
                imageView4.setImageDrawable(qs);
                break;
            case 39:
                Drawable qd = getResources().getDrawable(R.drawable.qd);
                imageView4.setImageDrawable(qd);
                break;
            case 40:
                Drawable qf = getResources().getDrawable(R.drawable.qf);
                imageView4.setImageDrawable(qf);
                break;
            case 41:
                Drawable qg = getResources().getDrawable(R.drawable.qg);
                imageView4.setImageDrawable(qg);
                break;
            case 42:
                Drawable qh = getResources().getDrawable(R.drawable.qh);
                imageView4.setImageDrawable(qh);
                break;
            case 43:
                Drawable qj = getResources().getDrawable(R.drawable.qj);
                imageView4.setImageDrawable(qj);
                break;
            case 44:
                Drawable qk = getResources().getDrawable(R.drawable.qk);
                imageView4.setImageDrawable(qk);
                break;
            case 45:
                Drawable ql = getResources().getDrawable(R.drawable.ql);
                imageView4.setImageDrawable(ql);
                break;
            case 46:
                Drawable qz = getResources().getDrawable(R.drawable.qz);
                imageView4.setImageDrawable(qz);
                break;
            case 47:
                Drawable qx = getResources().getDrawable(R.drawable.qx);
                imageView4.setImageDrawable(qx);
                break;
            case 48:
                Drawable qc = getResources().getDrawable(R.drawable.qc);
                imageView4.setImageDrawable(qc);
                break;
            case 49:
                Drawable qv = getResources().getDrawable(R.drawable.qv);
                imageView4.setImageDrawable(qv);
                break;
            case 50:
                Drawable qb = getResources().getDrawable(R.drawable.qb);
                imageView4.setImageDrawable(qb);
                break;
            case 51:
                Drawable qn = getResources().getDrawable(R.drawable.qn);
                imageView4.setImageDrawable(qn);
                break;
            case 52:
                Drawable qm = getResources().getDrawable(R.drawable.qm);
                imageView4.setImageDrawable(qm);
                break;
            case 53:
                Drawable wq = getResources().getDrawable(R.drawable.wq);
                imageView4.setImageDrawable(wq);
                break;
            case 54:
                Drawable ww = getResources().getDrawable(R.drawable.ww);
                imageView4.setImageDrawable(ww);
                break;
            case 55:
                Drawable we = getResources().getDrawable(R.drawable.we);
                imageView4.setImageDrawable(we);
                break;
            case 56:
                Drawable wr = getResources().getDrawable(R.drawable.wr);
                imageView4.setImageDrawable(wr);
                break;
            case 57:
                Drawable wt = getResources().getDrawable(R.drawable.wt);
                imageView4.setImageDrawable(wt);
                break;
            case 58:
                Drawable wy = getResources().getDrawable(R.drawable.wy);
                imageView4.setImageDrawable(wy);
                break;
            case 59:
                Drawable wf = getResources().getDrawable(R.drawable.wf);
                imageView4.setImageDrawable(wf);
                break;
            case 60:
                Drawable wc = getResources().getDrawable(R.drawable.wc);
                imageView4.setImageDrawable(wc);
                break;
        }
        item5 = ((int) (Math.random() * 60));
        item5++;
        if (item2 == item5 | item1 == item5 | item3 == item5 | item4 == item5) {
            while (item2 == item5 | item1 == item5 | item3 == item5 | item4 == item5) {
                item5 = ((int) (Math.random() * 60));
                item5++;
            }
        }
        switch (item5) {
            case 1:
                Drawable drawable = getResources().getDrawable(R.drawable.q);
                imageView5.setImageDrawable(drawable);
                break;
            case 2:
                Drawable q = getResources().getDrawable(R.drawable.w);
                imageView5.setImageDrawable(q);
                break;
            case 3:
                Drawable e = getResources().getDrawable(R.drawable.e);
                imageView5.setImageDrawable(e);
                break;
            case 4:
                Drawable r = getResources().getDrawable(R.drawable.r);
                imageView5.setImageDrawable(r);
                break;
            case 5:
                Drawable t = getResources().getDrawable(R.drawable.t);
                imageView5.setImageDrawable(t);
                break;
            case 6:
                Drawable wg = getResources().getDrawable(R.drawable.wg);
                imageView5.setImageDrawable(wg);
                break;
            case 7:
                Drawable d = getResources().getDrawable(R.drawable.d);
                imageView5.setImageDrawable(d);
                break;
            case 8:
                Drawable f = getResources().getDrawable(R.drawable.f);
                imageView5.setImageDrawable(f);
                break;
            case 9:
                Drawable g = getResources().getDrawable(R.drawable.g);
                imageView5.setImageDrawable(g);
                break;
            case 10:
                Drawable wh = getResources().getDrawable(R.drawable.wh);
                imageView5.setImageDrawable(wh);
                break;
            case 11:
                Drawable wj = getResources().getDrawable(R.drawable.wj);
                imageView5.setImageDrawable(wj);
                break;
            case 12:
                Drawable wk = getResources().getDrawable(R.drawable.wk);
                imageView5.setImageDrawable(wk);
                break;
            case 13:
                Drawable wl = getResources().getDrawable(R.drawable.wl);
                imageView5.setImageDrawable(wl);
                break;
            case 14:
                Drawable wz = getResources().getDrawable(R.drawable.wz);
                imageView5.setImageDrawable(wz);
                break;
            case 15:
                Drawable wx = getResources().getDrawable(R.drawable.wx);
                imageView5.setImageDrawable(wx);
                break;
            case 16:
                Drawable h = getResources().getDrawable(R.drawable.h);
                imageView5.setImageDrawable(h);
                break;
            case 17:
                Drawable j = getResources().getDrawable(R.drawable.j);
                imageView5.setImageDrawable(j);
                break;
            case 18:
                Drawable k = getResources().getDrawable(R.drawable.k);
                imageView5.setImageDrawable(k);
                break;
            case 19:
                Drawable l = getResources().getDrawable(R.drawable.l);
                imageView5.setImageDrawable(l);
                break;
            case 20:
                Drawable z = getResources().getDrawable(R.drawable.z);
                imageView5.setImageDrawable(z);
                break;
            case 21:
                Drawable x = getResources().getDrawable(R.drawable.x);
                imageView5.setImageDrawable(x);
                break;
            case 22:
                Drawable c = getResources().getDrawable(R.drawable.c);
                imageView5.setImageDrawable(c);
                break;
            case 23:
                Drawable vv = getResources().getDrawable(R.drawable.v);
                imageView5.setImageDrawable(vv);
                break;
            case 24:
                Drawable b = getResources().getDrawable(R.drawable.b);
                imageView5.setImageDrawable(b);
                break;
            case 25:
                Drawable n = getResources().getDrawable(R.drawable.n);
                imageView5.setImageDrawable(n);
                break;
            case 26:
                Drawable m = getResources().getDrawable(R.drawable.m);
                imageView5.setImageDrawable(m);
                break;
            case 27:
                Drawable qq = getResources().getDrawable(R.drawable.qq);
                imageView5.setImageDrawable(qq);
                break;
            case 28:
                Drawable qw = getResources().getDrawable(R.drawable.qw);
                imageView5.setImageDrawable(qw);
                break;
            case 29:
                Drawable qe = getResources().getDrawable(R.drawable.qe);
                imageView5.setImageDrawable(qe);
                break;
            case 30:
                Drawable qr = getResources().getDrawable(R.drawable.qr);
                imageView5.setImageDrawable(qr);
                break;
            case 31:
                Drawable qt = getResources().getDrawable(R.drawable.qt);
                imageView5.setImageDrawable(qt);
                break;
            case 32:
                Drawable qy = getResources().getDrawable(R.drawable.qy);
                imageView5.setImageDrawable(qy);
                break;
            case 33:
                Drawable qu = getResources().getDrawable(R.drawable.qu);
                imageView5.setImageDrawable(qu);
                break;
            case 34:
                Drawable qi = getResources().getDrawable(R.drawable.qi);
                imageView5.setImageDrawable(qi);
                break;
            case 35:
                Drawable qo = getResources().getDrawable(R.drawable.qo);
                imageView5.setImageDrawable(qo);
                break;
            case 36:
                Drawable qp = getResources().getDrawable(R.drawable.qp);
                imageView5.setImageDrawable(qp);
                break;
            case 37:
                Drawable qa = getResources().getDrawable(R.drawable.qa);
                imageView5.setImageDrawable(qa);
                break;
            case 38:
                Drawable qs = getResources().getDrawable(R.drawable.qs);
                imageView5.setImageDrawable(qs);
                break;
            case 39:
                Drawable qd = getResources().getDrawable(R.drawable.qd);
                imageView5.setImageDrawable(qd);
                break;
            case 40:
                Drawable qf = getResources().getDrawable(R.drawable.qf);
                imageView5.setImageDrawable(qf);
                break;
            case 41:
                Drawable qg = getResources().getDrawable(R.drawable.qg);
                imageView5.setImageDrawable(qg);
                break;
            case 42:
                Drawable qh = getResources().getDrawable(R.drawable.qh);
                imageView5.setImageDrawable(qh);
                break;
            case 43:
                Drawable qj = getResources().getDrawable(R.drawable.qj);
                imageView5.setImageDrawable(qj);
                break;
            case 44:
                Drawable qk = getResources().getDrawable(R.drawable.qk);
                imageView5.setImageDrawable(qk);
                break;
            case 45:
                Drawable ql = getResources().getDrawable(R.drawable.ql);
                imageView5.setImageDrawable(ql);
                break;
            case 46:
                Drawable qz = getResources().getDrawable(R.drawable.qz);
                imageView5.setImageDrawable(qz);
                break;
            case 47:
                Drawable qx = getResources().getDrawable(R.drawable.qx);
                imageView5.setImageDrawable(qx);
                break;
            case 48:
                Drawable qc = getResources().getDrawable(R.drawable.qc);
                imageView5.setImageDrawable(qc);
                break;
            case 49:
                Drawable qv = getResources().getDrawable(R.drawable.qv);
                imageView5.setImageDrawable(qv);
                break;
            case 50:
                Drawable qb = getResources().getDrawable(R.drawable.qb);
                imageView5.setImageDrawable(qb);
                break;
            case 51:
                Drawable qn = getResources().getDrawable(R.drawable.qn);
                imageView5.setImageDrawable(qn);
                break;
            case 52:
                Drawable qm = getResources().getDrawable(R.drawable.qm);
                imageView5.setImageDrawable(qm);
                break;
            case 53:
                Drawable wq = getResources().getDrawable(R.drawable.wq);
                imageView5.setImageDrawable(wq);
                break;
            case 54:
                Drawable ww = getResources().getDrawable(R.drawable.ww);
                imageView5.setImageDrawable(ww);
                break;
            case 55:
                Drawable we = getResources().getDrawable(R.drawable.we);
                imageView5.setImageDrawable(we);
                break;
            case 56:
                Drawable wr = getResources().getDrawable(R.drawable.wr);
                imageView5.setImageDrawable(wr);
                break;
            case 57:
                Drawable wt = getResources().getDrawable(R.drawable.wt);
                imageView5.setImageDrawable(wt);
                break;
            case 58:
                Drawable wy = getResources().getDrawable(R.drawable.wy);
                imageView5.setImageDrawable(wy);
                break;
            case 59:
                Drawable wf = getResources().getDrawable(R.drawable.wf);
                imageView5.setImageDrawable(wf);
                break;
            case 60:
                Drawable wc = getResources().getDrawable(R.drawable.wc);
                imageView5.setImageDrawable(wc);
                break;
        }
        item6 = ((int) (Math.random() * 7));
        item6++;
        switch (item6) {
            case 1:
                Drawable sq = getResources().getDrawable(R.drawable.y);
                imageView6.setImageDrawable(sq);
                break;
            case 2:
                Drawable sw = getResources().getDrawable(R.drawable.u);
                imageView6.setImageDrawable(sw);
                break;
            case 3:
                Drawable se = getResources().getDrawable(R.drawable.i);
                imageView6.setImageDrawable(se);
                break;
            case 4:
                Drawable sr = getResources().getDrawable(R.drawable.o);
                imageView6.setImageDrawable(sr);
                break;
            case 5:
                Drawable st = getResources().getDrawable(R.drawable.p);
                imageView6.setImageDrawable(st);
                break;
            case 6:
                Drawable sy = getResources().getDrawable(R.drawable.a);
                imageView6.setImageDrawable(sy);
                break;
            case 7:
                Drawable su = getResources().getDrawable(R.drawable.s);
                imageView6.setImageDrawable(su);
                break;


        }
        item7 = ((int) (Math.random() * 4));
        item7++;
        switch(item7) {
            case 1:
                Drawable tq = getResources().getDrawable(R.drawable.tq);
                imageView7.setImageDrawable(tq);
                break;
            case 2:
                Drawable tw = getResources().getDrawable(R.drawable.tw);
                imageView7.setImageDrawable(tw);
                break;
            case 3:
                Drawable te = getResources().getDrawable(R.drawable.te);
                imageView7.setImageDrawable(te);
                break;
            case 4:
                Drawable tr = getResources().getDrawable(R.drawable.tr);
                imageView7.setImageDrawable(tr);
                break;
        }
    }
    public void info(View v){
        Intent intent = new Intent(getApplicationContext(), Show.class);
        startActivity(intent);
    }
    }








