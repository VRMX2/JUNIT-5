package Tp3;

import java.util.concurrent.TimeUnit;

public class DB_API {

    public boolean DBconnect(String db, String country) {
        boolean c = false;
        try {

            if (db.equals("Oracle")) {
                if (country.equals("Algeria")) {
                    TimeUnit.SECONDS.sleep(2);
                    c = true;
                } else {
                    if (country.equals("France")) {
                        TimeUnit.SECONDS.sleep(3);
                        c = false;
                    } else {
                        if (country.equals("USA")) {
                            TimeUnit.SECONDS.sleep(1);
                            c = true;
                        }
                    }
                }
            } else {
                if (db.equals("MySQL")) {
                    if (country.equals("Algeria")) {
                        c = false;
                    } else {
                        if (country.equals("France")) {
                            TimeUnit.SECONDS.sleep(5);
                            c = true;
                        } else {
                            if (country.equals("USA")) {
                                TimeUnit.SECONDS.sleep(1);
                                c = true;
                            }
                        }
                    }
                } else {
                    if (db.equals("SQLServer")) {
                        if (country.equals("Algeria")) {
                            c = false;
                        } else {
                            if (country.equals("France")) {
                                TimeUnit.SECONDS.sleep(2);
                                c = false;
                            } else {
                                if (country.equals("USA")) {
                                    TimeUnit.SECONDS.sleep(10);
                                    c = true;
                                }
                            }
                        }
                    }
                }
            }

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return c;
    }
}
