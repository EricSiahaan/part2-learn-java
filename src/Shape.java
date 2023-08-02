class Shape {
    // parent classs
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    // child class
    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        // menggunakan kata kunci super
        return getCorner();
    }
}
