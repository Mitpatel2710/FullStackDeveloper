package org.studyeasy.shop;


public class Door {
    private Lock lock;

    public Door() {
        lock = new Lock(true);
    }

    public Lock getLock() {
        return lock;
    }

    public void shopStatus() {
        if (lock.isLock()) {
            System.out.println("Shop is closed, please visit later");
        } else {
            System.out.println("Welcome, we are open");
        }

    }

    public class Lock {
        private boolean Lock;

        public Lock(boolean lock) {
            this.Lock = lock;
        }

        public boolean isLock() {
            return Lock;
        }

        public void setLock(boolean lock) {
            this.Lock = lock;
        }
    }
}

