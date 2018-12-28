public class Demo {

    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        int myStrongestArm = Math.max(yourLeft, yourRight);
        int friendsStrongestArm = Math.max(friendsLeft, friendsRight);

        int myWeakestArm = Math.min(yourLeft, yourRight);
        int friendsWeakestArm = Math.min(friendsLeft, friendsRight);

        return (myStrongestArm == friendsStrongestArm) && (myWeakestArm == friendsWeakestArm);
    }
}