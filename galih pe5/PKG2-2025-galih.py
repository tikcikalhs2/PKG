import tkinter as tk

poin1=0
poin2=0
giliran = 1
app = tk.Tk()
app.title('Aplikasi')
app.geometry('1300x200')

def add(amount):
    global poin1, poin2, giliran
    if giliran==1:
        poin1=poin1+amount
        giliran=2
    else:
        poin2=poin2+amount
        giliran=1
    label1.config(text=f'P1:{poin1} P2:{poin2}')
    
    if poin1>=20:
        label1.config(text='Pemenang nya pemain 1')
        btn1.pack_forget()
        btn2.pack_forget()
        btn3.pack_forget()
    elif poin2>=20:
        label1.config(text='Pemenang nya pemain 2')
        btn1.pack_forget()
        btn2.pack_forget()
        btn3.pack_forget()
    else:
        label1.config(text=f'P1:{poin1} P2:{poin2}')



label1=tk.Label(app,text='Giliran pemain 1')
label1.pack()
btn1=tk.Button(app,text='+1', command=lambda:add(1))
btn1.pack()
btn2=tk.Button(app,text='+2', command=lambda:add(2))
btn2.pack()
btn3=tk.Button(app,text='+3', command=lambda:add(3))
btn3.pack()




app.mainloop()