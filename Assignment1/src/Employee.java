
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaustubh
 */
public class Employee {
    private int mUID;
    private String gender;
    private String mName;
    private Date mDob;
    private String mEmail;
    private String mMobileNumber;
    private File mProfileLocation;
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
     public boolean validateName() {
        return isNotNull(mName) && !mName.isEmpty() && mName.matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$");
    }
    public boolean validateEmail() {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        return isNotNull(mEmail) && !mEmail.isEmpty() && mEmail.matches(regex);
    }

     public boolean validateDOB() {
        return isNotNull(mDob);
    }
     
     public boolean validateMobileNumber() {
        return validateNumber(mMobileNumber,10);
    }
    
    private boolean isNotNull(String mName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public boolean validateProfile() {
        if(mProfileLocation == null)
           return false;
        try {
            Image image = ImageIO.read(mProfileLocation);
            if (image == null) {
                return false;
            }
            return true;
        } catch(IOException ex) {
            return false;
        }
        
    }

    private boolean validateNumber(String mMobileNumber, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean isNotNull(Date mDob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }
    
      public String getmMobileNumber() {
        return mMobileNumber;
    }

    public void setmMobileNumber(String mMobileNumber) {
        this.mMobileNumber = mMobileNumber;
    }
    
     public Date getmDob() {
        return mDob;
    }

    public void setmDob(Date mDob) {
        this.mDob = mDob;
    }
    
    public File getmProfileLocation() {
        return mProfileLocation;
    }

    public void setmProfileLocation(File mProfileLocation) {
        this.mProfileLocation = mProfileLocation;
    }
        public int getmUID() {
        return mUID;
    }

    public void setmUID(int mUID) {
        this.mUID = mUID;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
    
    
}
