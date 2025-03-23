/**
 * ./src/app/menus.tsx: 配置菜单
 * 配置菜单的时候也必须保证具有对应约定路由
 */
import {MenuDataItem} from "@ant-design/pro-layout";
import {BarChartOutlined, BulbOutlined, CrownOutlined, HomeOutlined, SnippetsOutlined} from "@ant-design/icons";
import {ACCESS_ENUM} from "@/constants";

const menus = [
    {
        path: "/",
        name: "主页",
        icon: <HomeOutlined/>,
        access: ACCESS_ENUM.NOT_LOGIN,
    },
    {
        path: "/status",
        name: "状态",
        icon: <BarChartOutlined />,
        access: ACCESS_ENUM.USER,
    },
    {
        path: "/form",
        name: "表单",
        icon: <SnippetsOutlined />,
        access: ACCESS_ENUM.USER,
    },
    {
        path: "/admin",
        name: "管理",
        icon: <CrownOutlined/>,
        access: ACCESS_ENUM.ADMIN,
        children: [
            {
                path: "/admin/users",
                name: "用户列表",
            },
            {
                path: "/admin/roles",
                name: "角色列表",
                hideInMenu: true, // TODO: 暂时屏蔽
            },
            {
                path: "/admin/levels",
                name: "等级列表",
                hideInMenu: true, // TODO: 暂时屏蔽
            },
        ],
    },
    {
        path: "/other",
        name: "其他",
        icon: <BulbOutlined/>,
        access: ACCESS_ENUM.NOT_LOGIN,
    },
] as MenuDataItem[]; // 这样写会提供编写本菜单配置的智能提示

export default menus;
