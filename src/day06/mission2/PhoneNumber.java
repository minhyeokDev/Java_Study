package day06.mission2;

public class PhoneNumber {

    private String value;

    public PhoneNumber(String value) {
        this.validate(value);
        this.value = value;
    }

    private void validate(String phoneNumber) {
        String input1 = "^01(?:0)(\\d{3}|\\d{4})(\\d{4})$";
        String input2 = "^\\d{3}\\d{4}\\d{4}$";

        if(!phoneNumber.matches(input1)) { // 010  시작 x 정규식 이용?
            if(!phoneNumber.matches(input2)){ //11글자 x
                throw new IllegalArgumentException("휴대폰 번호는 11글자여야 합니다.");
            }
            throw new IllegalArgumentException("휴대폰 번호는 010으로 시작해야 합니다.");
        }
    }

    public String getPhoneNumberFormally() {
        String regEx = "(\\d{3})(\\d{3,4})(\\d{4})";
        return this.value.replaceAll(regEx,"$1-$2-$3");
    }
}
