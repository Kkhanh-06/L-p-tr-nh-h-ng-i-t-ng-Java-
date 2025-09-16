package hinh_chu_nhat;

public class HinhChuNhat {
    private long width, height;

    public HinhChuNhat (long width, long height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public long getWidth () {
        return width;
    }

    public long getHeight () {
        return height;
    }

    public void setWidth (long width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Nhap chieu rong la so nguyen duong!");
        }
        this.width = width;
    }

    public void setHeight (long height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Nhap chieu dai la so nguyen duong!");
        }
        this.height = height;
    }

    public long getArea () {
        return width * height;
    }

    public long getPerimeter () {
        return 2 * (width * height);
    }
}
