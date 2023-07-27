package com.jackmeng.stl.ui;

public enum ux_Key
{
    _ENTER('\u0000', 0x0),
    _BACK_SPACE('\u0000', 0xa),
    _TAB('\u0000', 0x14),
    _CANCEL('\u0000', 0x1e),
    _CLEAR('\u0000', 0x28),
    _SHIFT('\u0000', 0x32),
    _CONTROL('\u0000', 0x3c),
    _ALT('\u0000', 0x46),
    _PAUSE('\u0000', 0x50),
    _CAPS_LOCK('\u0000', 0x5a),
    _ESCAPE('\u0000', 0x64),
    _SPACE('\u0000', 0x6e),
    _PAGE_UP('\u0000', 0x78),
    _PAGE_DOWN('\u0000', 0x82),
    _END('\u0000', 0x8c),
    _HOME('\u0000', 0x96),
    _LEFT('\u0000', 0xa0),
    _UP('\u0000', 0xaa),
    _RIGHT('\u0000', 0xb4),
    _DOWN('\u0000', 0xbe),
    _COMMA('\u0000', 0xc8),
    _MINUS('\u0000', 0xd2),
    _PERIOD('\u0000', 0xdc),
    _SLASH('\u0000', 0xe6),
    _SEMICOLON('\u0000', 0xf0),
    _EQUALS('\u0000', 0xfa),
    _A('a', 0x104),
    _B('b', 0x10e),
    _C('c', 0x118),
    _D('d', 0x122),
    _E('e', 0x12c),
    _F('f', 0x136),
    _G('g', 0x140),
    _H('h', 0x14a),
    _I('i', 0x154),
    _J('j', 0x15e),
    _K('k', 0x168),
    _L('l', 0x172),
    _M('m', 0x17c),
    _N('n', 0x186),
    _O('o', 0x190),
    _P('p', 0x19a),
    _Q('q', 0x1a4),
    _R('r', 0x1ae),
    _S('s', 0x1b8),
    _T('t', 0x1c2),
    _U('u', 0x1cc),
    _V('v', 0x1d6),
    _W('w', 0x1e0),
    _X('x', 0x1ea),
    _Y('y', 0x1f4),
    _Z('z', 0x1fe),
    _OPEN_BRACKET('\u0000', 0x208),
    _BACK_SLASH('\u0000', 0x212),
    _CLOSE_BRACKET('\u0000', 0x21c),
    _NUMPAD0('\u0000', 0x226),
    _NUMPAD1('\u0000', 0x230),
    _NUMPAD2('\u0000', 0x23a),
    _NUMPAD3('\u0000', 0x244),
    _NUMPAD4('\u0000', 0x24e),
    _NUMPAD5('\u0000', 0x258),
    _NUMPAD6('\u0000', 0x262),
    _NUMPAD7('\u0000', 0x26c),
    _NUMPAD8('\u0000', 0x276),
    _NUMPAD9('\u0000', 0x280),
    _MULTIPLY('\u0000', 0x28a),
    _ADD('\u0000', 0x294),
    _SEPARATER('\u0000', 0x29e),
    _SEPARATOR('\u0000', 0x2a8),
    _SUBTRACT('\u0000', 0x2b2),
    _DECIMAL('\u0000', 0x2bc),
    _DIVIDE('\u0000', 0x2c6),
    _DELETE('\u0000', 0x2d0),
    _NUM_LOCK('\u0000', 0x2da),
    _SCROLL_LOCK('\u0000', 0x2e4),
    _F1('\u0000', 0x2ee),
    _F2('\u0000', 0x2f8),
    _F3('\u0000', 0x302),
    _F4('\u0000', 0x30c),
    _F5('\u0000', 0x316),
    _F6('\u0000', 0x320),
    _F7('\u0000', 0x32a),
    _F8('\u0000', 0x334),
    _F9('\u0000', 0x33e),
    _F10('\u0000', 0x348),
    _F11('\u0000', 0x352),
    _F12('\u0000', 0x35c),
    _F13('\u0000', 0x366),
    _F14('\u0000', 0x370),
    _F15('\u0000', 0x37a),
    _F16('\u0000', 0x384),
    _F17('\u0000', 0x38e),
    _F18('\u0000', 0x398),
    _F19('\u0000', 0x3a2),
    _F20('\u0000', 0x3ac),
    _F21('\u0000', 0x3b6),
    _F22('\u0000', 0x3c0),
    _F23('\u0000', 0x3ca),
    _F24('\u0000', 0x3d4),
    _PRINTSCREEN('\u0000', 0x3de),
    _INSERT('\u0000', 0x3e8),
    _HELP('\u0000', 0x3f2),
    _META('\u0000', 0x3fc),
    _BACK_QUOTE('\u0000', 0x406),
    _QUOTE('\u0000', 0x410),
    _KP_UP('\u0000', 0x41a),
    _KP_DOWN('\u0000', 0x424),
    _KP_LEFT('\u0000', 0x42e),
    _KP_RIGHT('\u0000', 0x438),
    _DEAD_GRAVE('\u0000', 0x442),
    _DEAD_ACUTE('\u0000', 0x44c),
    _DEAD_CIRCUMFLEX('\u0000', 0x456),
    _DEAD_TILDE('\u0000', 0x460),
    _DEAD_MACRON('\u0000', 0x46a),
    _DEAD_BREVE('\u0000', 0x474),
    _DEAD_ABOVEDOT('\u0000', 0x47e),
    _DEAD_DIAERESIS('\u0000', 0x488),
    _DEAD_ABOVERING('\u0000', 0x492),
    _DEAD_DOUBLEACUTE('\u0000', 0x49c),
    _DEAD_CARON('\u0000', 0x4a6),
    _DEAD_CEDILLA('\u0000', 0x4b0),
    _DEAD_OGONEK('\u0000', 0x4ba),
    _DEAD_IOTA('\u0000', 0x4c4),
    _DEAD_VOICED_SOUND('\u0000', 0x4ce),
    _DEAD_SEMIVOICED_SOUND('\u0000', 0x4d8),
    _AMPERSAND('\u0000', 0x4e2),
    _ASTERISK('\u0000', 0x4ec),
    _QUOTEDBL('\u0000', 0x4f6),
    _LESS('\u0000', 0x500),
    _GREATER('\u0000', 0x50a),
    _BRACELEFT('\u0000', 0x514),
    _BRACERIGHT('\u0000', 0x51e),
    _AT('\u0000', 0x528),
    _COLON('\u0000', 0x532),
    _CIRCUMFLEX('\u0000', 0x53c),
    _DOLLAR('\u0000', 0x546),
    _EURO_SIGN('\u0000', 0x550),
    _EXCLAMATION_MARK('\u0000', 0x55a),
    _INVERTED_EXCLAMATION_MARK('\u0000', 0x564),
    _LEFT_PARENTHESIS('\u0000', 0x56e),
    _NUMBER_SIGN('\u0000', 0x578),
    _PLUS('\u0000', 0x582),
    _RIGHT_PARENTHESIS('\u0000', 0x58c),
    _UNDERSCORE('\u0000', 0x596),
    _WINDOWS('\u0000', 0x5a0),
    _CONTEXT_MENU('\u0000', 0x5aa),
    _FINAL('\u0000', 0x5b4),
    _CONVERT('\u0000', 0x5be),
    _NONCONVERT('\u0000', 0x5c8),
    _ACCEPT('\u0000', 0x5d2),
    _MODECHANGE('\u0000', 0x5dc),
    _KANA('\u0000', 0x5e6),
    _KANJI('\u0000', 0x5f0),
    _ALPHANUMERIC('\u0000', 0x5fa),
    _KATAKANA('\u0000', 0x604),
    _HIRAGANA('\u0000', 0x60e),
    _FULL_WIDTH('\u0000', 0x618),
    _HALF_WIDTH('\u0000', 0x622),
    _ROMAN_CHARACTERS('\u0000', 0x62c),
    _ALL_CANDIDATES('\u0000', 0x636),
    _PREVIOUS_CANDIDATE('\u0000', 0x640),
    _CODE_INPUT('\u0000', 0x64a),
    _JAPANESE_KATAKANA('\u0000', 0x654),
    _JAPANESE_HIRAGANA('\u0000', 0x65e),
    _JAPANESE_ROMAN('\u0000', 0x668),
    _KANA_LOCK('\u0000', 0x672),
    _INPUT_METHOD_ON_OFF('\u0000', 0x67c),
    _CUT('\u0000', 0x686),
    _COPY('\u0000', 0x690),
    _PASTE('\u0000', 0x69a),
    _UNDO('\u0000', 0x6a4),
    _AGAIN('\u0000', 0x6ae),
    _FIND('\u0000', 0x6b8),
    _PROPS('\u0000', 0x6c2),
    _STOP('\u0000', 0x6cc),
    _COMPOSE('\u0000', 0x6d6),
    _ALT_GRAPH('\u0000', 0x6e0),
    _BEGIN('\u0000', 0x6ea),
    _UNDEFINED('\u0000', 0x6f4);

    final char code;
    final int id;

    private ux_Key(char code, int id)
    {
        this.code = code;
        this.id = id;
    }

    public char code()
    {
        return code;
    }

    public int id()
    {
        return id;
    }
}