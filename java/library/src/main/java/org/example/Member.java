package org.example;

public class Member {
    int memberId;
    String name;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public MemberAccount getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(MemberAccount memberAccount) {
        this.memberAccount = memberAccount;
    }

    Address address; // the address of a member
    MemberAccount memberAccount; // A member has an account
public void openAccount(Address ad,int memberId,String name,int ac){
this.address=ad;
this.memberId=memberId;
memberAccount.accountNo=ac;
this.name=name;


}
}
