package com.example.qburst.newworld;
import android.os.Parcelable;
import android.os.Parcel;
public class Info implements Parcelable
{
    //public static final long serialVersionUID =1L;
    private String name;
    private String course;
    private String college;
    private String place;
  public Info()
  {
      ;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


    @Override
    public int describeContents()
    {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel out,int flags)
    {
        out.writeString(name);
        out.writeString(course);
        out.writeString(college);
        out.writeString(place);
    }
    private Info(Parcel in) {

        name = in.readString();
        course = in.readString();
        college = in.readString();
        place = in.readString();
    }
    public static final Parcelable.Creator<Info> CREATOR = new Parcelable.Creator<Info>()
    {
        public Info createFromParcel(Parcel in) {
            return new Info(in);
        }

        public Info[] newArray(int size) {
            return new Info[size];
        }
    };

}
