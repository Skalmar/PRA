
public class Parsing {
    String sql;
    public boolean check_sql(String clause) {
        clause += ' ';
        int i;
        int l = clause.length();
        int x = 0;
        sql = "";
        for (i = 0; i < l; i++) {
            if (clause.charAt(i) == ' ') {
                System.out.println(clause.substring(x, i));
                if (clause.substring(x, i).equals("SELECT")) {
                    sql += 1;
                } else if (clause.substring(x, i).equals("FROM")) {
                    sql += 2;
                } else if (clause.substring(x, i).equals("WHERE")) {
                    sql += 3;
                } else if (clause.substring(x, i).equals("ORDER")) {
                    sql += 4;
                } else if (clause.substring(x, i).equals("BY")) {
                    sql += 5;
                }
                x = i + 1;
            }
            }
            if ((sql.equals("12")) || (sql.equals("123")) || (sql.equals("1245")) || (sql.equals("12345"))) {
                System.out.println("Thumbs up!");
                return true;
            } else {
                System.out.println("ERROR: wrong order of clauses in a sql query!");
                return false;
            }
        }
    }