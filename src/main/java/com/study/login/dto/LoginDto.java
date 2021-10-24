package com.study.login.dto;

import com.study.login.domain.Member;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
public class LoginDto {

    @NotBlank
    private String member_id;

    @NotBlank
    private String member_password;

    public Member getMember() {
        Member member = new Member();
        member.setMember_id(this.member_id);
        member.setMember_password(this.member_password);
        return member;
    }
}
