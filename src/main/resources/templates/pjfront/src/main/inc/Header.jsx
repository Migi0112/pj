import React from 'react';

const Header = () => {
    return (
        <div>
            <header className="main-header">
                <div className="header-frame">
                    <div className="text-center header-top">
                        <div className="row">
                            <div className="col align-left">
                                <div className="header-basket_login side-div">
                                    <div className="header-basket">
                                        <a className="head-font1">장바구니</a>
                                    </div>
                                    <div className="header-login">
                                        <a className="head-font1">로그인</a>
                                    </div>
                                </div>
                            </div>
                            <div className="header-title col-6">
                                <div className="siteTitle">
                                    <a href="#" className="head-font2">주말랭이</a>
                                </div>
                            </div>
                            <div className="header-search col">
                                <div className="head-search">
                                    <form name="head-search" method="post">
                                        <input type="text" name="keyword" placeholder="👀 주말에 어디로 가볼랭?" title="검색"/>
                                        <a className="search-tool">
                                            <i className="bi bi-search"></i>
                                        </a>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div className="header-bottom">

                    </div>
                </div>
            </header>
        </div>
    )
}

export default Header;