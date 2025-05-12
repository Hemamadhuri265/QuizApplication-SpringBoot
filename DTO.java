
// specially for the score and mail fetching class to store score linked to the user mail id //

package dto;  // Package declaration //Data Transfer Object package  

public class scoreRequest {

    private String email;
    private int score;

    // Getters and setters
    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}


