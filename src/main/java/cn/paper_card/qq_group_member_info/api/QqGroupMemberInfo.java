package cn.paper_card.qq_group_member_info.api;

public record QqGroupMemberInfo(
        long qq,
        String nick,
        String nameCard,
        long createTime,
        boolean inGroup,
        int qLevel

) {
}
