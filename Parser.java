// Output created by jacc on Mon Nov 13 14:15:17 BRST 2017


class Parser implements Tokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (tipo
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    switch (yytok) {
                        case CLASS:
                            yyn = 2;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 280;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    switch (yytok) {
                        case ID:
                            yyn = 3;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    switch (yytok) {
                        case '{':
                            yyn = 4;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    switch (yytok) {
                        case PUBLIC:
                            yyn = 5;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    switch (yytok) {
                        case STATIC:
                            yyn = 6;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    switch (yytok) {
                        case VOID:
                            yyn = 7;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    switch (yytok) {
                        case MAIN:
                            yyn = 8;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    switch (yytok) {
                        case '(':
                            yyn = 9;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    switch (yytok) {
                        case STRING:
                            yyn = 10;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    switch (yytok) {
                        case '[':
                            yyn = 11;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    switch (yytok) {
                        case ']':
                            yyn = 12;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
                    switch (yytok) {
                        case ID:
                            yyn = 13;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    switch (yytok) {
                        case ')':
                            yyn = 14;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    switch (yytok) {
                        case '{':
                            yyn = 15;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 156:
                    switch (yytok) {
                        case '}':
                            yyn = 36;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 157:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 158:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 159:
                    switch (yytok) {
                        case ID:
                            yyn = 47;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 160:
                    switch (yytok) {
                        case '=':
                            yyn = 48;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 161:
                    switch (yytok) {
                        case ID:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 163:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 164:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 165:
                    switch (yytok) {
                        case '[':
                            yyn = 51;
                            continue;
                        case ID:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 166:
                    switch (yytok) {
                        case ID:
                            yyn = 52;
                            continue;
                        case INT:
                            yyn = 53;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 167:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 168:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 169:
                    switch (yytok) {
                        case '(':
                            yyn = 54;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 170:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 171:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 172:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 173:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 174:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 175:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 176:
                    switch (yytok) {
                        case '}':
                            yyn = 59;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 177:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 178:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 179:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 180:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 181:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 182:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 183:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 184:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 185:
                    switch (yytok) {
                        case ID:
                            yyn = 68;
                            continue;
                        case LENGTH:
                            yyn = 69;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 186:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 187:
                    switch (yytok) {
                        case ';':
                            yyn = 71;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 188:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 189:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 190:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 191:
                    switch (yytok) {
                        case ']':
                            yyn = 74;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 192:
                    switch (yytok) {
                        case '(':
                            yyn = 75;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 193:
                    switch (yytok) {
                        case '[':
                            yyn = 76;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 194:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 195:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 196:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 197:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 198:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 199:
                    switch (yytok) {
                        case CLASS:
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 200:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 201:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 202:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 203:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 204:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 205:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 206:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 207:
                    yyn = yys67();
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 208:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 209:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 210:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 211:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 212:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 213:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 214:
                    switch (yytok) {
                        case ID:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 215:
                    switch (yytok) {
                        case ')':
                            yyn = 84;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 216:
                    yyn = yys76();
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 217:
                    yyn = yys77();
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 218:
                    yyn = yys78();
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 219:
                    yyn = yys79();
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 220:
                    switch (yytok) {
                        case CLASS:
                            yyn = 89;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 221:
                    yyn = yys81();
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 222:
                    yyn = yys82();
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 223:
                    switch (yytok) {
                        case '}':
                            yyn = 93;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 224:
                    yyn = yys84();
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 225:
                    yyn = yys85();
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 226:
                    yyn = yys86();
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 227:
                    switch (yytok) {
                        case '}':
                            yyn = 95;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 228:
                    switch (yytok) {
                        case CLASS:
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 229:
                    switch (yytok) {
                        case ID:
                            yyn = 96;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 230:
                    yyn = yys90();
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 231:
                    switch (yytok) {
                        case ')':
                            yyn = 97;
                            continue;
                        case ',':
                            yyn = 98;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 232:
                    yyn = yys92();
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 233:
                    yyn = yys93();
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 234:
                    yyn = yys94();
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 235:
                    yyn = yys95();
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 236:
                    switch (yytok) {
                        case '{':
                            yyn = 100;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 237:
                    yyn = yys97();
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 238:
                    yyn = yys98();
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 239:
                    switch (yytok) {
                        case '{':
                            yyn = 102;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 240:
                    switch (yytok) {
                        case '}':
                        case INT:
                        case PUBLIC:
                        case ID:
                        case BOOLEAN:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 241:
                    yyn = yys101();
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 242:
                    yyn = yys102();
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 243:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 21;
                            continue;
                        case INT:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 107;
                            continue;
                        case '}':
                        case PUBLIC:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 244:
                    switch (yytok) {
                        case '}':
                            yyn = 108;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 245:
                    switch (yytok) {
                        case PUBLIC:
                            yyn = 110;
                            continue;
                        case '}':
                            yyn = 111;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 246:
                    switch (yytok) {
                        case '}':
                        case INT:
                        case PUBLIC:
                        case ID:
                        case BOOLEAN:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 247:
                    switch (yytok) {
                        case ID:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 248:
                    yyn = yys108();
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 249:
                    switch (yytok) {
                        case '}':
                        case PUBLIC:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 250:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 21;
                            continue;
                        case INT:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 107;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 251:
                    switch (yytok) {
                        case CLASS:
                        case ENDINPUT:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 252:
                    switch (yytok) {
                        case ID:
                            yyn = 113;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 253:
                    switch (yytok) {
                        case '(':
                            yyn = 114;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 254:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 21;
                            continue;
                        case INT:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 107;
                            continue;
                        case ')':
                            yyn = 117;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 255:
                    switch (yytok) {
                        case ')':
                            yyn = 118;
                            continue;
                        case ',':
                            yyn = 119;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 256:
                    switch (yytok) {
                        case ID:
                            yyn = 120;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 257:
                    switch (yytok) {
                        case '{':
                            yyn = 121;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 258:
                    switch (yytok) {
                        case '{':
                            yyn = 122;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 259:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 21;
                            continue;
                        case INT:
                            yyn = 25;
                            continue;
                        case ID:
                            yyn = 107;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 260:
                    switch (yytok) {
                        case ')':
                        case ',':
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 261:
                    yyn = yys121();
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 262:
                    yyn = yys122();
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 263:
                    switch (yytok) {
                        case ID:
                            yyn = 126;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 264:
                    yyn = yys124();
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 265:
                    yyn = yys125();
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 266:
                    switch (yytok) {
                        case ')':
                        case ',':
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 267:
                    yyn = yys127();
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 268:
                    switch (yytok) {
                        case RETURN:
                            yyn = 132;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 269:
                    yyn = yys129();
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 270:
                    switch (yytok) {
                        case RETURN:
                            yyn = 133;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 271:
                    switch (yytok) {
                        case RETURN:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 272:
                    yyn = yys132();
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 273:
                    yyn = yys133();
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 274:
                    yyn = yys134();
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 275:
                    yyn = yys135();
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 276:
                    switch (yytok) {
                        case '}':
                            yyn = 138;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 277:
                    switch (yytok) {
                        case '}':
                            yyn = 139;
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 278:
                    switch (yytok) {
                        case '}':
                        case PUBLIC:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 279:
                    switch (yytok) {
                        case '}':
                        case PUBLIC:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 283;
                    continue;

                case 280:
                    return true;
                case 281:
                    yyerror("stack overflow");
                case 282:
                    return false;
                case 283:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys15() {
        switch (yytok) {
            case BOOLEAN:
                return 21;
            case FALSE:
                return 22;
            case ID:
                return 23;
            case IF:
                return 24;
            case INT:
                return 25;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case PRINTLN:
                return 29;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case WHILE:
                return 32;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
        }
        return 283;
    }

    private int yys17() {
        switch (yytok) {
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
            case NEW:
            case '(':
            case '!':
            case FALSE:
            case WHILE:
            case TRUE:
            case THIS:
            case '}':
            case RETURN:
            case INT:
            case PRINTLN:
            case IF:
            case NUM:
            case NULL:
            case ID:
            case BOOLEAN:
                return yyr26();
        }
        return 283;
    }

    private int yys18() {
        switch (yytok) {
            case STRING:
            case PUBLIC:
            case STATIC:
            case MAIN:
            case LENGTH:
            case '=':
            case NEG:
            case '^':
            case error:
            case VOID:
            case EXTENDS:
            case CLASS:
            case ELSE:
            case ENDINPUT:
                return 283;
            case '.':
                return 45;
            case '[':
                return 46;
        }
        return yyr44();
    }

    private int yys22() {
        switch (yytok) {
            case NEG:
            case PUBLIC:
            case STATIC:
            case MAIN:
            case LENGTH:
            case '=':
            case '[':
            case '.':
            case error:
            case VOID:
            case EXTENDS:
            case CLASS:
            case ELSE:
            case ENDINPUT:
            case STRING:
            case '^':
                return 283;
        }
        return yyr38();
    }

    private int yys23() {
        switch (yytok) {
            case NEG:
            case STATIC:
            case '{':
            case error:
            case VOID:
            case LENGTH:
            case ']':
            case '=':
            case ',':
            case ')':
            case EXTENDS:
            case CLASS:
            case MAIN:
            case ELSE:
            case ENDINPUT:
            case '^':
            case PUBLIC:
            case ';':
            case STRING:
                return 283;
            case ID:
                return yyr18();
        }
        return yyr45();
    }

    private int yys24() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys27() {
        switch (yytok) {
            case NEG:
            case PUBLIC:
            case STATIC:
            case MAIN:
            case LENGTH:
            case '=':
            case '[':
            case '.':
            case error:
            case VOID:
            case EXTENDS:
            case CLASS:
            case ELSE:
            case ENDINPUT:
            case STRING:
            case '^':
                return 283;
        }
        return yyr40();
    }

    private int yys28() {
        switch (yytok) {
            case NEG:
            case PUBLIC:
            case STATIC:
            case MAIN:
            case LENGTH:
            case '=':
            case '[':
            case '.':
            case error:
            case VOID:
            case EXTENDS:
            case CLASS:
            case ELSE:
            case ENDINPUT:
            case STRING:
            case '^':
                return 283;
        }
        return yyr39();
    }

    private int yys30() {
        switch (yytok) {
            case NEG:
            case STRING:
            case ELSE:
            case LENGTH:
            case error:
            case '=':
            case PUBLIC:
            case ENDINPUT:
            case VOID:
            case MAIN:
            case EXTENDS:
            case CLASS:
            case STATIC:
            case '^':
                return 283;
        }
        return yyr46();
    }

    private int yys31() {
        switch (yytok) {
            case NEG:
            case PUBLIC:
            case STATIC:
            case MAIN:
            case LENGTH:
            case '=':
            case '[':
            case '.':
            case error:
            case VOID:
            case EXTENDS:
            case CLASS:
            case ELSE:
            case ENDINPUT:
            case STRING:
            case '^':
                return 283;
        }
        return yyr37();
    }

    private int yys32() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys33() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys34() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys35() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys37() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys38() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys39() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys40() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys41() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys42() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys43() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys44() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys46() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys48() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys49() {
        switch (yytok) {
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
            case '{':
                return 73;
        }
        return 283;
    }

    private int yys50() {
        switch (yytok) {
            case NEG:
            case STRING:
            case ELSE:
            case LENGTH:
            case error:
            case '=':
            case PUBLIC:
            case ENDINPUT:
            case VOID:
            case MAIN:
            case EXTENDS:
            case CLASS:
            case STATIC:
            case '^':
                return 283;
        }
        return yyr45();
    }

    private int yys54() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys55() {
        switch (yytok) {
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
            case '{':
                return 78;
        }
        return 283;
    }

    private int yys56() {
        switch (yytok) {
            case ELSE:
            case '[':
            case LENGTH:
            case ENDINPUT:
            case '=':
            case PUBLIC:
            case MAIN:
            case '^':
            case STATIC:
            case '.':
            case EXTENDS:
            case CLASS:
            case error:
            case NEG:
            case VOID:
            case STRING:
                return 283;
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
        }
        return yyr36();
    }

    private int yys57() {
        switch (yytok) {
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
            case ')':
                return 79;
        }
        return 283;
    }

    private int yys58() {
        switch (yytok) {
            case ELSE:
            case '[':
            case LENGTH:
            case ENDINPUT:
            case '=':
            case PUBLIC:
            case MAIN:
            case '^':
            case STATIC:
            case '.':
            case EXTENDS:
            case CLASS:
            case error:
            case NEG:
            case VOID:
            case STRING:
                return 283;
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
        }
        return yyr35();
    }

    private int yys60() {
        switch (yytok) {
            case ELSE:
            case '[':
            case LENGTH:
            case ENDINPUT:
            case '=':
            case PUBLIC:
            case MAIN:
            case '^':
            case STATIC:
            case '.':
            case EXTENDS:
            case CLASS:
            case error:
            case NEG:
            case VOID:
            case STRING:
                return 283;
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
        }
        return yyr34();
    }

    private int yys61() {
        switch (yytok) {
            case ELSE:
            case '[':
            case LENGTH:
            case ENDINPUT:
            case '=':
            case PUBLIC:
            case MAIN:
            case '^':
            case STATIC:
            case '.':
            case EXTENDS:
            case CLASS:
            case error:
            case NEG:
            case VOID:
            case STRING:
                return 283;
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
        }
        return yyr32();
    }

    private int yys62() {
        switch (yytok) {
            case ELSE:
            case '[':
            case LENGTH:
            case ENDINPUT:
            case '=':
            case PUBLIC:
            case MAIN:
            case '^':
            case STATIC:
            case '.':
            case EXTENDS:
            case CLASS:
            case error:
            case NEG:
            case VOID:
            case STRING:
                return 283;
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
        }
        return yyr33();
    }

    private int yys63() {
        switch (yytok) {
            case '[':
            case LENGTH:
            case PUBLIC:
            case '.':
            case NEG:
            case ENDINPUT:
            case '=':
            case error:
            case STRING:
            case ELSE:
            case EXTENDS:
            case CLASS:
            case VOID:
            case MAIN:
            case '^':
            case STATIC:
                return 283;
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '<':
                return 44;
        }
        return yyr29();
    }

    private int yys64() {
        switch (yytok) {
            case STRING:
            case PUBLIC:
            case '=':
            case ELSE:
            case MAIN:
            case VOID:
            case '[':
            case LENGTH:
            case '.':
            case ENDINPUT:
            case EXTENDS:
            case CLASS:
            case error:
            case NEG:
            case '^':
            case STATIC:
                return 283;
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '/':
                return 43;
            case '<':
                return 44;
        }
        return yyr27();
    }

    private int yys65() {
        switch (yytok) {
            case STRING:
            case PUBLIC:
            case '=':
            case ELSE:
            case MAIN:
            case VOID:
            case '[':
            case LENGTH:
            case '.':
            case ENDINPUT:
            case EXTENDS:
            case CLASS:
            case error:
            case NEG:
            case '^':
            case STATIC:
                return 283;
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '/':
                return 43;
            case '<':
                return 44;
        }
        return yyr28();
    }

    private int yys66() {
        switch (yytok) {
            case '[':
            case LENGTH:
            case PUBLIC:
            case '.':
            case NEG:
            case ENDINPUT:
            case '=':
            case error:
            case STRING:
            case ELSE:
            case EXTENDS:
            case CLASS:
            case VOID:
            case MAIN:
            case '^':
            case STATIC:
                return 283;
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '<':
                return 44;
        }
        return yyr30();
    }

    private int yys67() {
        switch (yytok) {
            case ELSE:
            case '[':
            case LENGTH:
            case ENDINPUT:
            case '=':
            case PUBLIC:
            case MAIN:
            case '^':
            case STATIC:
            case '.':
            case EXTENDS:
            case CLASS:
            case error:
            case NEG:
            case VOID:
            case STRING:
                return 283;
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
        }
        return yyr31();
    }

    private int yys68() {
        switch (yytok) {
            case STRING:
            case '=':
            case ELSE:
            case LENGTH:
            case error:
            case '^':
            case PUBLIC:
            case ENDINPUT:
            case VOID:
            case MAIN:
            case EXTENDS:
            case CLASS:
            case NEG:
            case STATIC:
                return 283;
            case '(':
                return 81;
        }
        return yyr49();
    }

    private int yys69() {
        switch (yytok) {
            case NEG:
            case PUBLIC:
            case STATIC:
            case MAIN:
            case LENGTH:
            case '=':
            case '[':
            case '.':
            case error:
            case VOID:
            case EXTENDS:
            case CLASS:
            case ELSE:
            case ENDINPUT:
            case STRING:
            case '^':
                return 283;
        }
        return yyr42();
    }

    private int yys70() {
        switch (yytok) {
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
            case ']':
                return 82;
        }
        return 283;
    }

    private int yys71() {
        switch (yytok) {
            case NEW:
            case '(':
            case '!':
            case FALSE:
            case WHILE:
            case TRUE:
            case THIS:
            case '}':
            case RETURN:
            case INT:
            case '=':
            case PUBLIC:
            case PRINTLN:
            case IF:
            case '-':
            case NUM:
            case NULL:
            case ID:
            case BOOLEAN:
                return yyr8();
        }
        return 283;
    }

    private int yys72() {
        switch (yytok) {
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
            case NEW:
            case '(':
            case '!':
            case FALSE:
            case WHILE:
            case TRUE:
            case THIS:
            case '}':
            case RETURN:
            case INT:
            case PRINTLN:
            case IF:
            case NUM:
            case NULL:
            case ID:
            case BOOLEAN:
                return yyr25();
        }
        return 283;
    }

    private int yys73() {
        switch (yytok) {
            case BOOLEAN:
                return 21;
            case FALSE:
                return 22;
            case ID:
                return 23;
            case IF:
                return 24;
            case INT:
                return 25;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case PRINTLN:
                return 29;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case WHILE:
                return 32;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
        }
        return 283;
    }

    private int yys76() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys77() {
        switch (yytok) {
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
            case ')':
                return 86;
        }
        return 283;
    }

    private int yys78() {
        switch (yytok) {
            case BOOLEAN:
                return 21;
            case FALSE:
                return 22;
            case ID:
                return 23;
            case IF:
                return 24;
            case INT:
                return 25;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case PRINTLN:
                return 29;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case WHILE:
                return 32;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
        }
        return 283;
    }

    private int yys79() {
        switch (yytok) {
            case NEG:
            case STRING:
            case ELSE:
            case LENGTH:
            case error:
            case '=':
            case PUBLIC:
            case ENDINPUT:
            case VOID:
            case MAIN:
            case EXTENDS:
            case CLASS:
            case STATIC:
            case '^':
                return 283;
        }
        return yyr48();
    }

    private int yys81() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
            case ')':
                return 92;
        }
        return 283;
    }

    private int yys82() {
        switch (yytok) {
            case NEG:
            case PUBLIC:
            case STATIC:
            case MAIN:
            case LENGTH:
            case '=':
            case '[':
            case '.':
            case error:
            case VOID:
            case EXTENDS:
            case CLASS:
            case ELSE:
            case ENDINPUT:
            case STRING:
            case '^':
                return 283;
        }
        return yyr43();
    }

    private int yys84() {
        switch (yytok) {
            case NEG:
            case STRING:
            case ELSE:
            case LENGTH:
            case error:
            case '=':
            case PUBLIC:
            case ENDINPUT:
            case VOID:
            case MAIN:
            case EXTENDS:
            case CLASS:
            case STATIC:
            case '^':
                return 283;
        }
        return yyr47();
    }

    private int yys85() {
        switch (yytok) {
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
            case ']':
                return 94;
        }
        return 283;
    }

    private int yys86() {
        switch (yytok) {
            case NEW:
            case '(':
            case '!':
            case FALSE:
            case WHILE:
            case TRUE:
            case THIS:
            case '}':
            case RETURN:
            case INT:
            case PRINTLN:
            case IF:
            case '-':
            case NUM:
            case NULL:
            case ID:
            case BOOLEAN:
                return yyr24();
        }
        return 283;
    }

    private int yys90() {
        switch (yytok) {
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
            case ')':
            case ',':
                return yyr53();
        }
        return 283;
    }

    private int yys92() {
        switch (yytok) {
            case NEG:
            case STRING:
            case ELSE:
            case LENGTH:
            case error:
            case '=':
            case PUBLIC:
            case ENDINPUT:
            case VOID:
            case MAIN:
            case EXTENDS:
            case CLASS:
            case STATIC:
            case '^':
                return 283;
        }
        return yyr51();
    }

    private int yys93() {
        switch (yytok) {
            case ELSE:
                return 99;
            case NEW:
            case '(':
            case '!':
            case FALSE:
            case WHILE:
            case TRUE:
            case THIS:
            case '}':
            case RETURN:
            case INT:
            case PRINTLN:
            case IF:
            case '-':
            case NUM:
            case NULL:
            case ID:
            case BOOLEAN:
                return yyr21();
        }
        return 283;
    }

    private int yys94() {
        switch (yytok) {
            case NEG:
            case PUBLIC:
            case STATIC:
            case MAIN:
            case LENGTH:
            case '=':
            case '[':
            case '.':
            case error:
            case VOID:
            case EXTENDS:
            case CLASS:
            case ELSE:
            case ENDINPUT:
            case STRING:
            case '^':
                return 283;
        }
        return yyr41();
    }

    private int yys95() {
        switch (yytok) {
            case NEW:
            case '(':
            case '!':
            case FALSE:
            case WHILE:
            case TRUE:
            case THIS:
            case '}':
            case RETURN:
            case INT:
            case PRINTLN:
            case IF:
            case '-':
            case NUM:
            case NULL:
            case ID:
            case BOOLEAN:
                return yyr23();
        }
        return 283;
    }

    private int yys97() {
        switch (yytok) {
            case NEG:
            case STRING:
            case ELSE:
            case LENGTH:
            case error:
            case '=':
            case PUBLIC:
            case ENDINPUT:
            case VOID:
            case MAIN:
            case EXTENDS:
            case CLASS:
            case STATIC:
            case '^':
                return 283;
        }
        return yyr50();
    }

    private int yys98() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys101() {
        switch (yytok) {
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
            case ')':
            case ',':
                return yyr52();
        }
        return 283;
    }

    private int yys102() {
        switch (yytok) {
            case BOOLEAN:
                return 21;
            case FALSE:
                return 22;
            case ID:
                return 23;
            case IF:
                return 24;
            case INT:
                return 25;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case PRINTLN:
                return 29;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case WHILE:
                return 32;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
        }
        return 283;
    }

    private int yys108() {
        switch (yytok) {
            case NEW:
            case '(':
            case '!':
            case FALSE:
            case WHILE:
            case TRUE:
            case THIS:
            case '}':
            case RETURN:
            case INT:
            case PRINTLN:
            case IF:
            case '-':
            case NUM:
            case NULL:
            case ID:
            case BOOLEAN:
                return yyr22();
        }
        return 283;
    }

    private int yys121() {
        switch (yytok) {
            case NEW:
            case '(':
            case '!':
            case FALSE:
            case WHILE:
            case TRUE:
            case THIS:
            case RETURN:
            case INT:
            case PRINTLN:
            case IF:
            case '-':
            case NUM:
            case NULL:
            case ID:
            case BOOLEAN:
                return yyr7();
        }
        return 283;
    }

    private int yys122() {
        switch (yytok) {
            case NEW:
            case '(':
            case '!':
            case FALSE:
            case WHILE:
            case TRUE:
            case THIS:
            case RETURN:
            case INT:
            case PRINTLN:
            case IF:
            case '-':
            case NUM:
            case NULL:
            case ID:
            case BOOLEAN:
                return yyr7();
        }
        return 283;
    }

    private int yys124() {
        switch (yytok) {
            case BOOLEAN:
                return 21;
            case FALSE:
                return 22;
            case ID:
                return 23;
            case IF:
                return 24;
            case INT:
                return 25;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case PRINTLN:
                return 29;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case WHILE:
                return 32;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case RETURN:
                return yyr20();
        }
        return 283;
    }

    private int yys125() {
        switch (yytok) {
            case BOOLEAN:
                return 21;
            case FALSE:
                return 22;
            case ID:
                return 23;
            case IF:
                return 24;
            case INT:
                return 25;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case PRINTLN:
                return 29;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case WHILE:
                return 32;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case RETURN:
                return yyr20();
        }
        return 283;
    }

    private int yys127() {
        switch (yytok) {
            case BOOLEAN:
                return 21;
            case FALSE:
                return 22;
            case ID:
                return 23;
            case IF:
                return 24;
            case INT:
                return 25;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case PRINTLN:
                return 29;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case WHILE:
                return 32;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case RETURN:
                return yyr20();
        }
        return 283;
    }

    private int yys129() {
        switch (yytok) {
            case '=':
                return 48;
            case NEW:
            case '(':
            case '!':
            case FALSE:
            case WHILE:
            case TRUE:
            case THIS:
            case RETURN:
            case INT:
            case PRINTLN:
            case IF:
            case '-':
            case NUM:
            case NULL:
            case ID:
            case BOOLEAN:
                return yyr6();
        }
        return 283;
    }

    private int yys132() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys133() {
        switch (yytok) {
            case FALSE:
                return 22;
            case NEW:
                return 26;
            case NULL:
                return 27;
            case NUM:
                return 28;
            case THIS:
                return 30;
            case TRUE:
                return 31;
            case '!':
                return 33;
            case '(':
                return 34;
            case '-':
                return 35;
            case ID:
                return 50;
        }
        return 283;
    }

    private int yys134() {
        switch (yytok) {
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
            case ';':
                return 136;
        }
        return 283;
    }

    private int yys135() {
        switch (yytok) {
            case AND:
                return 37;
            case EQ:
                return 38;
            case NEQ:
                return 39;
            case '*':
                return 40;
            case '+':
                return 41;
            case '-':
                return 42;
            case '/':
                return 43;
            case '<':
                return 44;
            case ';':
                return 137;
        }
        return 283;
    }

    private int yyr1() { // prog : CLASS ID '{' PUBLIC STATIC VOID MAIN '(' STRING '[' ']' ID ')' '{' cmd '}' '}' classes
        { saida = new Prog(((Token)yysv[yysp-17]).getTexto(), ((Token)yysv[yysp-7]).getTexto(), ((Cmd)yysv[yysp-4]), ((java.util.List)yysv[yysp-1])); yyrv = saida; }
        yysv[yysp-=18] = yyrv;
        return 1;
    }

    private int yyr2() { // classes : classes classe
        { ((java.util.List)yysv[yysp-2]).add(yysv[yysp-1]); yyrv = ((java.util.List)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return 80;
    }

    private int yyr3() { // classes : /* empty */
        { yyrv = new java.util.ArrayList<Classe>(); }
        yysv[yysp-=0] = yyrv;
        return 80;
    }

    private int yyr21() { // cmd : IF exp '{' cmd '}'
        yysp -= 5;
        return yypcmd();
    }

    private int yyr22() { // cmd : IF exp '{' cmd '}' ELSE '{' cmd '}'
        yysp -= 9;
        return yypcmd();
    }

    private int yyr23() { // cmd : WHILE exp '{' cmd '}'
        yysp -= 5;
        return yypcmd();
    }

    private int yyr24() { // cmd : PRINTLN '(' exp ')'
        yysp -= 4;
        return yypcmd();
    }

    private int yyr25() { // cmd : var '=' exp
        yysp -= 3;
        return yypcmd();
    }

    private int yyr26() { // cmd : exp
        yysp -= 1;
        return yypcmd();
    }

    private int yypcmd() {
        switch (yyst[yysp-1]) {
            case 102: return 104;
            case 78: return 87;
            case 73: return 83;
            case 15: return 16;
            default: return 127;
        }
    }

    private int yyr19() { // cmds : cmd cmds
        { ((java.util.List)yysv[yysp-1]).add(0, ((Cmd)yysv[yysp-2])); yyrv = ((java.util.List)yysv[yysp-1]); }
        yysv[yysp-=2] = yyrv;
        return yypcmds();
    }

    private int yyr20() { // cmds : /* empty */
        { yyrv = new java.util.ArrayList<Cmd>(); }
        yysv[yysp-=0] = yyrv;
        return yypcmds();
    }

    private int yypcmds() {
        switch (yyst[yysp-1]) {
            case 125: return 130;
            case 124: return 128;
            default: return 131;
        }
    }

    private int yyr27() { // exp : exp '+' exp
        { yyrv = new Soma(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr28() { // exp : exp '-' exp
        { yyrv = new Sub(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr29() { // exp : exp '*' exp
        { yyrv = new Mult(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr30() { // exp : exp '/' exp
        { yyrv = new Div(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr31() { // exp : exp '<' exp
        { yyrv = new Menor(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr32() { // exp : exp EQ exp
        { yyrv = new Igual(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr33() { // exp : exp NEQ exp
        { yyrv = new Dif(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr34() { // exp : exp AND exp
        { yyrv = new ELog(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr35() { // exp : '-' exp
        { yyrv = new Neg(((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=2] = yyrv;
        return yypexp();
    }

    private int yyr36() { // exp : '!' exp
        { yyrv = new Nao(((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=2] = yyrv;
        return yypexp();
    }

    private int yyr37() { // exp : TRUE
        { yyrv = True.INSTANCE; }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yyr38() { // exp : FALSE
        { yyrv = Fale.INSTANCE; }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yyr39() { // exp : NUM
        { yyrv = new Num(((Token)yysv[yysp-1]).getTexto()); }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yyr40() { // exp : NULL
        { yyrv = new Null(); }
        yysv[yysp-=1] = yyrv;
        return yypexp();
    }

    private int yyr41() { // exp : NEW INT '[' exp ']'
        { yyrv = new Vetor(((Exp)yysv[yysp-2]), ((Token)yysv[yysp-5]).getLin()); }
        yysv[yysp-=5] = yyrv;
        return yypexp();
    }

    private int yyr42() { // exp : pexp '.' LENGTH
        { yyrv = new Length(((Exp)yysv[yysp-3]), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr43() { // exp : pexp '[' exp ']'
        { yyrv = new Indexa(((Exp)yysv[yysp-4]), ((Exp)yysv[yysp-2]), ((Token)yysv[yysp-3]).getLin()); }
        yysv[yysp-=4] = yyrv;
        return yypexp();
    }

    private int yyr44() { // exp : pexp
        yysp -= 1;
        return yypexp();
    }

    private int yypexp() {
        switch (yyst[yysp-1]) {
            case 133: return 135;
            case 132: return 134;
            case 98: return 101;
            case 81: return 90;
            case 76: return 85;
            case 54: return 77;
            case 48: return 72;
            case 46: return 70;
            case 44: return 67;
            case 43: return 66;
            case 42: return 65;
            case 41: return 64;
            case 40: return 63;
            case 39: return 62;
            case 38: return 61;
            case 37: return 60;
            case 35: return 58;
            case 34: return 57;
            case 33: return 56;
            case 32: return 55;
            case 24: return 49;
            default: return 17;
        }
    }

    private int yyr52() { // exps : exps ',' exp
        { ((java.util.List)yysv[yysp-3]).add(((Exp)yysv[yysp-1])); yyrv = ((java.util.List)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return 91;
    }

    private int yyr53() { // exps : exp
        { java.util.List<Exp> l = new java.util.ArrayList<Exp>();
                        l.add(((Exp)yysv[yysp-1])); yyrv = l; }
        yysv[yysp-=1] = yyrv;
        return 91;
    }

    private int yyr11() { // metodo : PUBLIC tipo ID '(' ')' '{' vars cmds RETURN exp ';' '}'
        { yyrv = new Metodo(((String)yysv[yysp-11]), ((Token)yysv[yysp-10]).getTexto(), new java.util.ArrayList<Var>(), ((java.util.List)yysv[yysp-6]), ((java.util.List)yysv[yysp-5]), ((Exp)yysv[yysp-3]), ((Token)yysv[yysp-10]).getLin()); }
        yysv[yysp-=12] = yyrv;
        return 109;
    }

    private int yyr12() { // metodo : PUBLIC tipo ID '(' params ')' '{' vars cmds RETURN exp ';' '}'
        { yyrv = new Metodo(((String)yysv[yysp-12]), ((Token)yysv[yysp-11]).getTexto(), ((java.util.List)yysv[yysp-9]), ((java.util.List)yysv[yysp-6]), ((java.util.List)yysv[yysp-5]), ((Exp)yysv[yysp-3]), ((Token)yysv[yysp-11]).getLin()); }
        yysv[yysp-=13] = yyrv;
        return 109;
    }

    private int yyr9() { // metodos : metodos metodo
        { ((java.util.List)yysv[yysp-2]).add(yysv[yysp-1]); yyrv = ((java.util.List)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return 105;
    }

    private int yyr10() { // metodos : /* empty */
        { yyrv = new java.util.ArrayList<Metodo>(); }
        yysv[yysp-=0] = yyrv;
        return 105;
    }

    private int yyr13() { // params : params ',' tipo ID
        { ((java.util.List)yysv[yysp-4]).add(new Var(((String)yysv[yysp-2]), ((Token)yysv[yysp-1]).getTexto(), ((Token)yysv[yysp-1]).getLin())); yyrv = ((java.util.List)yysv[yysp-4]); }
        yysv[yysp-=4] = yyrv;
        return 115;
    }

    private int yyr14() { // params : tipo ID
        { java.util.List<Var> l = new java.util.ArrayList<Var>();
                                l.add(new Var(((String)yysv[yysp-2]), ((Token)yysv[yysp-1]).getTexto(), ((Token)yysv[yysp-1]).getLin())); yyrv = l; }
        yysv[yysp-=2] = yyrv;
        return 115;
    }

    private int yyr45() { // pexp : ID
        { yyrv = new Id(((Token)yysv[yysp-1]).getTexto(), ((Token)yysv[yysp-1]).getLin()); }
        yysv[yysp-=1] = yyrv;
        return 18;
    }

    private int yyr46() { // pexp : THIS
        { yyrv = This.INSTANCE; }
        yysv[yysp-=1] = yyrv;
        return 18;
    }

    private int yyr47() { // pexp : NEW ID '(' ')'
        { yyrv = new New(((Token)yysv[yysp-3]).getTexto(), ((Token)yysv[yysp-4]).getLin()); }
        yysv[yysp-=4] = yyrv;
        return 18;
    }

    private int yyr48() { // pexp : '(' exp ')'
        { yyrv = ((Exp)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return 18;
    }

    private int yyr49() { // pexp : pexp '.' ID
        { yyrv = new Campo(((Exp)yysv[yysp-3]), ((Token)yysv[yysp-1]).getTexto(), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        return 18;
    }

    private int yyr50() { // pexp : pexp '.' ID '(' exps ')'
        { yyrv = new Chamada(((Exp)yysv[yysp-6]), ((Token)yysv[yysp-4]).getTexto(), ((java.util.List)yysv[yysp-2]), ((Token)yysv[yysp-5]).getLin()); }
        yysv[yysp-=6] = yyrv;
        return 18;
    }

    private int yyr51() { // pexp : pexp '.' ID '(' ')'
        { yyrv = new Chamada(((Exp)yysv[yysp-5]), ((Token)yysv[yysp-3]).getTexto(), new java.util.ArrayList<Exp>(), ((Token)yysv[yysp-4]).getLin()); }
        yysv[yysp-=5] = yyrv;
        return 18;
    }

    private int yyr4() { // classe : CLASS ID '{' vars metodos '}'
        yysp -= 6;
        return 88;
    }

    private int yyr5() { // classe : /* empty */
        return 88;
    }

    private int yyr15() { // tipo : INT '[' ']'
        { yyrv = "int[]"; }
        yysv[yysp-=3] = yyrv;
        return yyptipo();
    }

    private int yyr16() { // tipo : BOOLEAN
        { yyrv = "boolean"; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyr17() { // tipo : INT
        { yyrv = "int"; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyr18() { // tipo : ID
        { yyrv = ((Token)yysv[yysp-1]).getTexto(); }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyptipo() {
        switch (yyst[yysp-1]) {
            case 119: return 123;
            case 114: return 116;
            case 110: return 112;
            default: return 19;
        }
    }

    private int yyr8() { // var : tipo ID ';'
        { yyrv = new Var(((String)yysv[yysp-3]), ((Token)yysv[yysp-2]).getTexto(), ((Token)yysv[yysp-2]).getLin()); }
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 125: return 129;
            case 124: return 129;
            case 103: return 106;
            default: return 20;
        }
    }

    private int yyr6() { // vars : vars var
        { ((java.util.List)yysv[yysp-2]).add(((Var)yysv[yysp-1])); yyrv = ((java.util.List)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return yypvars();
    }

    private int yyr7() { // vars : /* empty */
        { yyrv = new java.util.ArrayList<Var>(); }
        yysv[yysp-=0] = yyrv;
        return yypvars();
    }

    private int yypvars() {
        switch (yyst[yysp-1]) {
            case 121: return 124;
            case 100: return 103;
            default: return 125;
        }
    }

    protected String[] yyerrmsgs = {
    };


Scanner scan;

Token token;  // lookahead
int tipo;     // tipo do lookahead

public Prog saida; // workaround pro bug do tipo do parse()

public Parser(java.io.Reader entrada) {
  scan = new Scanner(entrada);
  proximo(); // inicializa o lookahead
}

int proximo() {
  try {
    token = scan.nextToken();
    tipo = token.getTipo();
    return tipo;
  } catch(java.io.IOException e) {
    throw new RuntimeException(e);
  }
}

void yyerror(String msg) {
  throw new RuntimeException("erro de sintaxe na linha: " + token.getLin());
}

}
